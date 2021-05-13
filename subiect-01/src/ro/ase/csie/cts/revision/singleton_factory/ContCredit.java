package ro.ase.csie.cts.revision.singleton_factory;

public class ContCredit implements InterfataContBancar {

    private static double DOBANDA = 0.02;
    double balanta;

    @Override
    public void transfer(InterfataContBancar destinatie, double suma) {
        balanta -= (1 + DOBANDA) * suma;
        System.out.println("Transfer din cont credit in valoare de " + (1 + DOBANDA) * suma);
    }

    @Override
    public void depune(double suma) {
        this.balanta += suma;
        System.out.println("Depunere in cont credit in valoare de " + suma);
    }
}
