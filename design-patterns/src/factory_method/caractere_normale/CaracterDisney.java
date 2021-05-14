package ro.ase.csie.cts.laborator.factory_method.caractere_normale;

import ro.ase.csie.cts.laborator.factory_method.CaracterJoc;

public class CaracterDisney extends CaracterJoc {
    public CaracterDisney(String nume) {
        this.nume = nume;
        this.putere = 100;
    }

    @Override
    public void seDeplaseaza() {
        System.out.println("Caracterul Disney se deplaseaza.");
    }
}
