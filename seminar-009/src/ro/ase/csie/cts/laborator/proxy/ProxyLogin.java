package ro.ase.csie.cts.laborator.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements InterfataLogin {

    InterfataLogin modulOficial;
    public static int NR_MAXIM_INCERCARI = 3;
    Map<String, Integer> utilizatori = new HashMap<>();

    public ProxyLogin(InterfataLogin modulOficial) {
        this.modulOficial = modulOficial;
    }

    @Override
    public boolean login(String username, String password) {
        Integer nrIncercari = utilizatori.get(username);
        if (nrIncercari == null) {
            utilizatori.put(username, 0);
            nrIncercari = utilizatori.get(username);
        }

        if (nrIncercari > NR_MAXIM_INCERCARI) {
            return false;
        }

        if (modulOficial.login(username, password)) {
            nrIncercari = 0;
            return true;
        } else {
            nrIncercari++;
            utilizatori.put(username, nrIncercari);
            if (nrIncercari == NR_MAXIM_INCERCARI) {
                System.out.println("Blocare cont.");
            }
            return false;
        }
    }

    @Override
    public boolean verificaStatusServer() {
        return modulOficial.verificaStatusServer();
    }
}
