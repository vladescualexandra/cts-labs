package ro.ase.csie.cts.laborator.proxy;

public class ModulLogin implements InterfataLogin{

    String ipServer;

    public ModulLogin(String ipServer) {
        this.ipServer = ipServer;
    }

    @Override
    public boolean login(String username, String passowrd) {
        if (username.equals("admin") && passowrd.equals("admin")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean verificaStatusServer() {
        return true;
    }
}
