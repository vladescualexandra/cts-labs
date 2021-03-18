package ro.ase.csie.cts.laborator.faza3.servicii;

import ro.ase.csie.cts.laborator.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.laborator.exceptii.ExceptieVechimeClient;

public class ServiciuValidari implements InterfataValidare{
    @Override
    public void validarePret(float pretInitial) throws ExceptiePretInvalid {
        if (pretInitial <= 0) {
            throw new ExceptiePretInvalid();
        }
    }

    @Override
    public void validareVechime(int vechimeClientInAni) throws ExceptieVechimeClient {
        if (vechimeClientInAni < 0) {
            throw new ExceptieVechimeClient();
        }
    }
}
