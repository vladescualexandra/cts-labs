package ro.ase.csie.cts.laborator.singleton.ref_static;

public class MainSingletonStatic {

    public static void main(String[] args) {
        ConexiuneBD conexiuneBD1 = ConexiuneBD.conexiune;
        ConexiuneBD conexiuneBD2 = ConexiuneBD.conexiune;

        if (conexiuneBD1 == conexiuneBD2) {
            System.out.println("Referinte identice.");
        } else {
            System.out.println("Referinte diferite.");
        }
    }
}
