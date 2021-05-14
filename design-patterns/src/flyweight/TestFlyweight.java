package flyweight;

public class TestFlyweight {

    public static void main(String[] args) {

        InterfataFlyweightModel3D copac1 = FactoryFlyweight.getModel(TipModel3D.COPAC);
        InterfataFlyweightModel3D copac2 = FactoryFlyweight.getModel(TipModel3D.COPAC);
        InterfataFlyweightModel3D copac3 = FactoryFlyweight.getModel(TipModel3D.COPAC);

        copac1.afisareEcran(new DetaliiAfisare(1, 2, "rosu"));
        copac1.afisareEcran(new DetaliiAfisare(5, 4, "alb"));
        copac1.afisareEcran(new DetaliiAfisare(12, 332, "verde"));
    }
}
