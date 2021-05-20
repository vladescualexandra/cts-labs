package ro.ase.csie.cts.laborator.memento;

public class SuperErou {

    String nume;
    int puncteViata;
    String magie;

    public SuperErou(String nume, int puncteViata, String magie) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.magie = magie;
    }

    public void ataca() {
        System.out.println("Ataca.");
    }

    public void esteLovit(int puncte) {
        this.puncteViata -= puncte;
    }

    public void seVindeca(int puncte) {
        this.puncteViata += puncte;
    }

    public MementoErou salvare() {
        return new MementoErou(nume, puncteViata, magie);
    }

    public void incarcaSalvare(MementoErou mementoErou) {
        this.nume = mementoErou.nume;
        this.puncteViata = mementoErou.puncteViata;
        this.magie = mementoErou.magie;
    }
}
