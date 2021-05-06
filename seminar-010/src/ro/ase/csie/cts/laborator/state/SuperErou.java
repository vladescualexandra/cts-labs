package ro.ase.csie.cts.laborator.state;

public class SuperErou {

    public static final int PUNCTE_NIVEL_CRITC = 50;
    public static final int PUNCTE_NIVEL_NORMAL = 500;
    int puncteViata;
    String efectMagic;
    String nume;

    InterfataModDeplasare stareDeplasare = null;

    public SuperErou(int puncteViata, String nume) {
        this.puncteViata = puncteViata;
        this.nume = nume;
    }

    public void seDeplaseaza() {

    }
}
