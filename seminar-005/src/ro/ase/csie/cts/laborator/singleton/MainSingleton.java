package ro.ase.csie.cts.laborator.singleton;

public class MainSingleton {

    public static void main(String[] args) {
        ConexiuneBD conexiuneBD1 = ConexiuneBD.getInstance();
        ConexiuneBD conexiuneBD2 = ConexiuneBD.getInstance();

        if (conexiuneBD1 == conexiuneBD2) {
            System.out.println("Referinte identice.");
        } else {
            System.out.println("Referinte diferite.");
        }

        ModulUI modulUI = new ModulUI();
        ModulProfil modulProfil = new ModulProfil();
    }
}
