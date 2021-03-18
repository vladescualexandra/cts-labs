package ro.ase.csie.cts.laborator.faza3;

import ro.ase.csie.cts.laborator.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.laborator.exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.laborator.faza3.servicii.InterfataMarketing;
import ro.ase.csie.cts.laborator.faza3.servicii.InterfataValidare;

public class Produs {

    InterfataMarketing serviciuMrk = null;
    InterfataValidare serviciuValidare = null;

    public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni)
            throws ExceptiePretInvalid, ExceptieVechimeClient {

        serviciuValidare.validarePret(pretInitial);
        serviciuValidare.validareVechime(vechimeClientInAni);


        float discountFidelitate = (tipProdus == TipProdus.NOU) ? 0 : serviciuMrk.getDiscountFidelitate(vechimeClientInAni);

        float discount = tipProdus.getDiscount();
        float valoareDiscountTipProdus = getPretCuDiscount(pretInitial, discount * pretInitial);
        float pretFinal = valoareDiscountTipProdus * (1 - discountFidelitate);

        return pretFinal;
    }

    private float getPretCuDiscount(float pretInitial, float v) {
        return pretInitial - (v);
    }


}