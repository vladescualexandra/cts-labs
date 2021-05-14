package ro.ase.csie.cts.laborator.factory_method;

import ro.ase.csie.cts.laborator.factory_method.caractere_normale.CaracterDcComics;
import ro.ase.csie.cts.laborator.factory_method.caractere_normale.CaracterDisney;
import ro.ase.csie.cts.laborator.factory_method.caractere_normale.CaracterMarvel;

public class FactoryModNormal extends FactoryAbstractCaracter{

    @Override
    public CaracterJoc getCaracter(TipCaracter tip, String nume) {
        CaracterJoc caracterJoc = null;
        switch (tip) {
            case DISNEY:
                caracterJoc = new CaracterDisney(nume);
                break;
            case MARVEL:
                caracterJoc = new CaracterMarvel(nume, 300);
                break;
            case DC_COMICS:
                caracterJoc = new CaracterDcComics(nume);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return caracterJoc;
    }
}
