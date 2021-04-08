package ro.ase.csie.cts.laborator.factory_method.caractere_normale;

import ro.ase.csie.cts.laborator.factory_method.CaracterJoc;

public class CaracterMarvel extends CaracterJoc {

    public CaracterMarvel(String nume, int putere) {
        this.nume = nume;
        this.putere = putere;
    }

    @Override
    public void seDeplaseaza() {
        System.out.println("Caracterul Marvel se deplaseaza.");
    }
}
