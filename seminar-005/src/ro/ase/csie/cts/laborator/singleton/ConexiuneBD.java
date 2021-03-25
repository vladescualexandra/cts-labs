package ro.ase.csie.cts.laborator.singleton;

public class ConexiuneBD {

    private static ConexiuneBD conexiuneBD = null;
    String ip;
    String denumire;

    private ConexiuneBD() {

    }

    private ConexiuneBD(String ip, String denumire) {
        System.out.println("Apel constructor.");
        this.ip = ip;
        this.denumire = denumire;
    }

    /* lazy-instantiation */
    public static synchronized ConexiuneBD getInstance() {
        if (conexiuneBD == null) {
            /* datele se pot prelua din fisiere de configurare */
            conexiuneBD = new ConexiuneBD("10.0.0.1", "CTS");
        }
        return conexiuneBD;
    }


}
