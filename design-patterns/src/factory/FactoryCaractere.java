package ro.ase.csie.cts.laborator.factory;

public class FactoryCaractere {

    public static CaracterAbstract getCaracter(TipCaracter tip, String nume) {
        CaracterAbstract caracter;

        switch (tip) {
            case DISNEY:
                caracter = new CaracterDisney(nume, "alb");
                break;
            case MARVEL:
                caracter = new CaracterMarvel(nume, 50);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return caracter;
    }
}
