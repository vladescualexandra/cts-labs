package ro.ase.csie.cts.laborator.factory;

import java.util.ArrayList;

public class TestFactory {

    public static void main(String[] args) {

//        CaracterAbstract mickeyMouse = new CaracterDisney("Mickey Mouse", "rosu");
//        CaracterAbstract spiderman = new CaracterMarvel("Spiderman", 25);

//        ArrayList<CaracterAbstract> caractere = new ArrayList<>();
//        caractere.add(mickeyMouse);
//        caractere.add(spiderman);

    CaracterAbstract mickeyMouse = FactoryCaractere.getCaracter(TipCaracter.DISNEY, "Mickey Mouse");

    }
}
