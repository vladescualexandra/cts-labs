package ro.ase.csie.laborator.modele;

import ro.ase.csie.laborator.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.laborator.exceptii.ExceptieTransferIlegal;

public abstract class Cont {

    public abstract double getBalanta();

    public abstract void alimenteaza(Double valoare);

    public abstract void extrage(Double valoare) throws ExceptieFonduriInsuficiente;

    public abstract void transfer(Double valoare, Cont destinatie) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;
}
