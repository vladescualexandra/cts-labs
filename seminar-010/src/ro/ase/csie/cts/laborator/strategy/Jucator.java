package ro.ase.csie.cts.laborator.strategy;

public class Jucator {

    int totalOreJucate;
    String nume;
    int clasaJucator;

    InterfataStrategieMarketing strategie = null;

    public Jucator(int totalOreJucate, String nume, int clasaJucator) {
        this.totalOreJucate = totalOreJucate;
        this.nume = nume;
        this.clasaJucator = clasaJucator;
    }

    public void acordaPuncteBonus() {
        if (this.strategie != null) {
            this.strategie.aplicaStrategieBonus(this);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public int getTotalOreJucate() {
        return totalOreJucate;
    }

    public String getNume() {
        return nume;
    }

    public int getClasaJucator() {
        return clasaJucator;
    }

    public void setStrategie(InterfataStrategieMarketing strategie) {
        this.strategie = strategie;
    }
}
