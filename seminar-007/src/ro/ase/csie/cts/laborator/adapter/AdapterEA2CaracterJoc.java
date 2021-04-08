package ro.ase.csie.cts.laborator.adapter;

import ro.ase.csie.cts.laborator.factory_method.CaracterJoc;

public class AdapterEA2CaracterJoc extends CaracterJoc {

    InterfataCaracterEA caracterEA;

    public AdapterEA2CaracterJoc(InterfataCaracterEA caracterEA) {
        super();
        this.caracterEA = caracterEA;
    }

    @Override
    public void seDeplaseaza() {
        caracterEA.move();
    }
}
