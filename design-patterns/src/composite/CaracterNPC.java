package composite;

public class CaracterNPC extends UnitateAbstractaJoc {

    String tip;
    int putere;

    public CaracterNPC(String tip, int putere) {
        this.tip = tip;
        this.putere = putere;
    }

    @Override
    public void seDeplaseaza(int x, int y) {
        System.out.println(String.format("%s se deplaseaza", tip));
    }

    @Override
    public void atacaJucator(int puncte) {
        System.out.println(String.format("%s ataca jucator.", tip));

    }

    @Override
    public void seRetrage() {
        System.out.println(String.format("%s se retrage.", tip));

    }

    // Solutie cand nu sunt implementate in nivelul abstract
    //    @Override
//    public void adaugaCaracter(UnitateAbstractaJoc unitate) {
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public void stergeCaracter(UnitateAbstractaJoc unitate) {
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public UnitateAbstractaJoc getCaracter(int index) {
//        throw new UnsupportedOperationException();
//    }


}
