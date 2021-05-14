package ro.ase.csie.cts.laborator.strategy;

public class TestStrategy {

    public static void main(String[] args) {

        Jucator jucator = new Jucator(150, "Gigel", 7);
        jucator.setStrategie(new StrategieJucatorNou());

        jucator.acordaPuncteBonus();
        System.out.println(jucator.clasaJucator);

        jucator.setStrategie(new StrategieZiuaCopilului());
        jucator.acordaPuncteBonus();
        System.out.println(jucator.clasaJucator);
    }
}
