package ro.ase.csie.laborator.modele;

public abstract class Cont {

    public abstract double getBalanta();

    public abstract void alimenteaza(Double valoare);

    public abstract void extrage(Double valoare);

    public abstract void transfer(Double valoare, Cont destinatie);
}
