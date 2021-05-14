package ro.ase.csie.cts.laborator.adapter;

import ro.ase.csie.cts.laborator.factory_method.CaracterJoc;
import ro.ase.csie.cts.laborator.factory_method.caractere_normale.CaracterDisney;

import java.util.ArrayList;

public class TestAdapter {

    public static void main(String[] args) {

        // 1. Colectie caractere existente
        ArrayList<CaracterJoc> caractere = new ArrayList<>();
        caractere.add(new CaracterDisney("Donald"));

        // 2. Colectie caractere EA
        ArrayList<InterfataCaracterEA> caractereEA = new ArrayList<>();
        caractereEA.add(new CaracterGenericEA());

        // Folosind un adapter.
        InterfataCaracterEA caracterEA = new CaracterGenericEA();
        AdapterEA2CaracterJoc adapter = new AdapterEA2CaracterJoc(caracterEA);

        caractere.add(adapter);
    }
}
