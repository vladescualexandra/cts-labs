package ro.ase.csie.cts.laborator.flyweight;

public class TestFlyweight {

    public static void main(String[] args) {

        DateEcran soldat1 = new DateEcran(100, 40, 21, "verde");
        DateEcran soldat2 = new DateEcran(75, 14, 114, "rosu");

        DateEcran cladire1 = new DateEcran(10, 10, 23, "gri");
        DateEcran cladire2 = new DateEcran(15, 20, 19, "maro");

        InterfataFlyweightModel3D modelSoldat = Model3DFactory.getModel(TipModel3D.SOLDAT);
        modelSoldat.afisareEcran(soldat1);
        modelSoldat.afisareEcran(soldat2);

        Model3DFactory.getModel(TipModel3D.CLADIRE).afisareEcran(cladire1);
        Model3DFactory.getModel(TipModel3D.CLADIRE).afisareEcran(cladire2);
    }
}
