package ro.ase.csie.cts.laborator.singleton.registru;

public class MainSingletonRegistru {

    public static void main(String[] args) {
        ConexiuneBD conexiuneBD1 = ConexiuneBD.getInstance("127.0.0.1", "cts");
        ConexiuneBD conexiuneBD2 = ConexiuneBD.getInstance("127.0.0.1", "cts");
        ConexiuneBD conexiuneBD3 = ConexiuneBD.getInstance("10.0.0.1", "poo");

        if (conexiuneBD1 == conexiuneBD2) {
            System.out.println("Referinte identice.");
        } else {
            System.out.println("Referinte diferite.");
        }

        if (conexiuneBD1 == conexiuneBD3) {
            System.out.println("Referinte identice.");
        } else {
            System.out.println("Referinte diferite.");
        }
    }
}
