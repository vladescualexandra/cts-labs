package ro.ase.csie.cts.laborator.factory_method;

public class TestFactoryMethod {
    public static void main(String[] args) {

        boolean isMod4Kids = true;

        if (isMod4Kids) {
            // dezvoltare doar cu caractere pentru copii
        } else {
            // dezvoltare doar cu caractere normale
        }

        FactoryAbstractCaracter factoryCaracter = null;
        factoryCaracter = (isMod4Kids) ? new FactoryMod4Kids() : new FactoryModNormal();

        // dezvoltare joc
        CaracterJoc superman = factoryCaracter.getCaracter(TipCaracter.MARVEL, "Superman");

    }
}
