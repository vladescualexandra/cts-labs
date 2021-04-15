package ro.ase.csie.cts.laborator.composite;

public abstract class UnitateAbstractaJoc implements InterfataNPC {

    // Intefata nodurilor frunoza este mostenita.
    // Aici definim interfata specifica nodurilor copil.

    public void adaugaCaracter(UnitateAbstractaJoc unitate) {
        throw new UnsupportedOperationException();
    }

    public void stergeCaracter(UnitateAbstractaJoc unitate) {
        throw new UnsupportedOperationException();
    }

    public UnitateAbstractaJoc getCaracter(int index) {
        throw new UnsupportedOperationException();
    }
}
