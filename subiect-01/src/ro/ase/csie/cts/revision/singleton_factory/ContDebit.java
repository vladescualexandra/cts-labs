package ro.ase.csie.cts.revision.singleton_factory;

public class ContDebit implements InterfataContBancar {

    double balanta;
    String IBAN;

    public ContDebit() {
    }

    public ContDebit(double balanta, String IBAN) {
        this.balanta = balanta;
        this.IBAN = IBAN;
    }

    @Override
    public void transfer(InterfataContBancar destinatie, double suma) {
        destinatie.depune(suma);
        this.balanta -= suma;
        System.out.println("Transfer din cont debit in valoare de " + suma);
    }

    @Override
    public void depune(double suma) {
        this.balanta += suma;
        System.out.println("Depunere in cont debit in valoare de " + suma);
    }
}
