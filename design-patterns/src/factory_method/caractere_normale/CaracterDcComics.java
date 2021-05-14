package ro.ase.csie.cts.laborator.factory_method.caractere_normale;

import ro.ase.csie.cts.laborator.factory_method.CaracterJoc;

public class CaracterDcComics extends CaracterJoc {

    public CaracterDcComics(String nume) {
        this.nume = nume;
        this.putere = 1000;
    }

    @Override
    public void seDeplaseaza() {
        System.out.println("Caracterul DC Comics se deplaseaza.");
    }
}
