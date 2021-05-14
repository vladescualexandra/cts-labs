package ro.ase.csie.cts.laborator.strategy;

public class StrategieZiuaCopilului implements InterfataStrategieMarketing {
    @Override
    public void aplicaStrategieBonus(Jucator jucator) {
        if (jucator.getClasaJucator() > 5) {
            jucator.clasaJucator *= 2;
        }
    }
}
