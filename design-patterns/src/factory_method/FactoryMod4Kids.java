package ro.ase.csie.cts.laborator.factory_method;

import ro.ase.csie.cts.laborator.factory_method.caractere_pentru_copii.CaracterDcComics4Kids;
import ro.ase.csie.cts.laborator.factory_method.caractere_pentru_copii.CaracterDisney4Kids;
import ro.ase.csie.cts.laborator.factory_method.caractere_pentru_copii.CaracterMarvel4Kids;

public class FactoryMod4Kids extends FactoryAbstractCaracter {

    @Override
    public CaracterJoc getCaracter(TipCaracter tip, String nume) {
        CaracterJoc caracterJoc = null;
        switch (tip) {
            case DISNEY:
                caracterJoc = new CaracterDisney4Kids();
                break;
            case MARVEL:
                caracterJoc = new CaracterMarvel4Kids();
                break;
            case DC_COMICS:
                caracterJoc = new CaracterDcComics4Kids();
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return caracterJoc;
    }
}
