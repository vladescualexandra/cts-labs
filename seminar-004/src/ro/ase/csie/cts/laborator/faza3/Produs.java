package ro.ase.csie.cts.laborator.faza3;

import ro.ase.csie.cts.laborator.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.laborator.exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.laborator.faza3.servicii.InterfataMarketing;
import ro.ase.csie.cts.laborator.faza3.servicii.InterfataValidare;
import ro.ase.csie.cts.laborator.faza3.servicii.ServiciuValidari;
import ro.ase.csie.cts.laborator.faza3.servicii.StrategieMarketing2021;

public class Produs {

    InterfataMarketing serviciuMrk = null;
    InterfataValidare serviciuValidare = null;

    public Produs(InterfataMarketing mk, InterfataValidare validare) {
        this.setServiciuMrk(mk);
        this.setServiciuValidare(validare);
    }

    private Produs() {
        for (Object serviciu : TestProdus.servicii) {
            if (serviciu instanceof InterfataMarketing) {
                this.setServiciuMrk((InterfataMarketing) serviciu);
            }
            if (serviciu instanceof InterfataValidare) {
                this.setServiciuValidare((InterfataValidare) serviciu);
            }
        }


    }


    public void setServiciuMrk(InterfataMarketing serviciuMrk) {
        if (serviciuMrk == null) {
            throw new NullPointerException();
        }
        this.serviciuMrk = serviciuMrk;
    }

    public void setServiciuValidare(InterfataValidare serviciuValidare) {
        if (serviciuValidare == null) {
            throw new NullPointerException();
        }
        this.serviciuValidare = serviciuValidare;
    }

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