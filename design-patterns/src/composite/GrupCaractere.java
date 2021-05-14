package composite;

import java.util.ArrayList;

public class GrupCaractere extends UnitateAbstractaJoc {

    ArrayList<UnitateAbstractaJoc> unitati = new ArrayList<>();

    @Override
    public void adaugaCaracter(UnitateAbstractaJoc unitate) {
        this.unitati.add(unitate);
    }

    @Override
    public void stergeCaracter(UnitateAbstractaJoc unitate) {
        this.unitati.remove(unitate);
    }

    @Override
    public UnitateAbstractaJoc getCaracter(int index) {
        if (index < 0 || index >= unitati.size()) {
            return null;
        }
        return unitati.get(index);
    }

    @Override
    public void seDeplaseaza(int x, int y) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void atacaJucator(int puncte) {
        for (UnitateAbstractaJoc unitate : unitati) {
            unitate.atacaJucator(0);
        }
    }

    @Override
    public void seRetrage() {
        for (UnitateAbstractaJoc unitate : unitati) {
            unitate.seRetrage();
        }
    }
}
