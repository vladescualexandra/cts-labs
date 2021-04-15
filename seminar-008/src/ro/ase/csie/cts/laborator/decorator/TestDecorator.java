package ro.ase.csie.cts.laborator.decorator;

public class TestDecorator {

    public static void main(String[] args) {
        SuperErou dragon = new Dragon("Dragon albastru", 1000);
        dragon.alearga();
        dragon.esteLovit(600);
        dragon.seVindeca(100);

        SuperErou dragon2 = new Dragon("Dragon galben", 1000);
        dragon2.alearga();
        dragon2.esteLovit(250);
        dragon2.seVindeca(100);

//        Aplicam decoratori doar pe primul dragon.
//        SuperErou dragonCuArmura = new DecoratorArmura(dragon, 300);
//        dragonCuArmura.esteLovit(600);

        dragon = new DecoratorArmura(dragon, 300);
        dragon.esteLovit(600);

        dragon = new DecoratorEsteRanit(dragon);
        dragon.esteLovit(800);
        dragon.alearga();
    }
}
