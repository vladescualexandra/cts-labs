package ro.ase.csie.cts.laborator.factory;

public class CaracterMarvel extends CaracterAbstract{

    int putere;

    public CaracterMarvel(String nume, int putere) {
        this.nume = nume;
        this.putere = putere;
    }

    @Override
    public void alearga() {
        System.out.println("CaracterMarvel alearga.");
    }

    @Override
    public void sare() {
        System.out.println("CaracterMarvel alearga.");
    }

}
