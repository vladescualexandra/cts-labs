package ro.ase.csie.cts.laborator.strategy;

public class StrategieJucatorNou implements InterfataStrategieMarketing {
    @Override
    public void aplicaStrategieBonus(Jucator jucator) {
        if (jucator.getTotalOreJucate() > 100) {
            jucator.clasaJucator += 1;
        }
    }
}
