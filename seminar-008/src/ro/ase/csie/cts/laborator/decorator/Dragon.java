package ro.ase.csie.cts.laborator.decorator;

public class Dragon extends SuperErou {

    public Dragon(String nume, int puncteViata) {
        super(nume, puncteViata);
    }

    @Override
    public void alearga() {
        System.out.println(String.format("%s zboara catre o noua destinatie.", this.nume));
    }

    @Override
    public void esteLovit(int puncte) {
        System.out.println(String.format("%s este lovit si pierde %d puncte", this.nume, puncte));
        this.puncteViata -= puncte;
    }

    @Override
    public void seVindeca(int puncte) {
        System.out.println(String.format("%s se vindeca cu %d puncte", this.nume, puncte));
        this.puncteViata += puncte;
    }
}
