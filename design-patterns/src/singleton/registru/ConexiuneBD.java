package ro.ase.csie.cts.laborator.singleton.registru;

import java.util.Hashtable;

public class ConexiuneBD {

    private static Hashtable<String, ConexiuneBD> conexiuni = new Hashtable<>();

    String ip;
    String denumire;

    private ConexiuneBD() {

    }

    private ConexiuneBD(String ip, String denumire) {
        System.out.println("Apel constructor - registru.");
        this.ip = ip;
        this.denumire = denumire;
    }

    public static ConexiuneBD getInstance(String ip, String denumire) {
        ConexiuneBD conexiuneBD = conexiuni.get(ip);
        if (conexiuneBD ==null) {
            conexiuni.put(ip, new ConexiuneBD(ip, denumire));
        }
        return conexiuni.get(ip);
    }
}
