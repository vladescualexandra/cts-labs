package ro.ase.csie.cts.laborator.faza3.servicii;

import ro.ase.csie.cts.laborator.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.laborator.exceptii.ExceptieVechimeClient;

public interface InterfataValidare {

    public void validarePret(float pretInitial) throws ExceptiePretInvalid;
    public void validareVechime(int vechimeClientInAni) throws ExceptieVechimeClient;

}
