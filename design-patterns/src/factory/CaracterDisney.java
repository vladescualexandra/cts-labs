package ro.ase.csie.cts.laborator.factory;

public class CaracterDisney extends CaracterAbstract{

    String culoare;
    boolean esteOkPentruCopii = true;

    public CaracterDisney( String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    @Override
    public void alearga() {
        System.out.println("CaracterDisney alearga.");
    }

    @Override
    public void sare() {
        System.out.println("CaracterDisney sare.");
    }

}

