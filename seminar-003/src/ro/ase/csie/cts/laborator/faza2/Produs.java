package ro.ase.csie.cts.laborator.faza2;

import ro.ase.csie.cts.laborator.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.laborator.exceptii.ExceptieVechimeClient;

public class Produs {

    public static final int VECHIME_CLIENT_MAXIMA = 10;
    public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;

    public static void validarePret(float pretInitial) throws ExceptiePretInvalid {
        if (pretInitial <= 0) {
            throw new ExceptiePretInvalid();
        }
    }

    private static void validareVechime(int vechimeClientInAni) throws ExceptieVechimeClient {
        if (vechimeClientInAni < 0) {
            throw new ExceptieVechimeClient();
        }
    }

    public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni)
            throws ExceptiePretInvalid, ExceptieVechimeClient {

        validarePret(pretInitial);
        validareVechime(vechimeClientInAni);

        float pretFinal = 0;
        float discountFidelitate = getDiscountFidelitate(vechimeClientInAni);
        float valoareDiscountTipProdus = 0;

        float discount = TipProdus.NOU.getDiscount();
        switch (tipProdus) {
            case NOU:
                pretFinal = pretInitial;
                break;
            case DISCOUNT:
                discount = TipProdus.DISCOUNT.getDiscount();
                valoareDiscountTipProdus = getPretCuDiscount(pretInitial, discount * pretInitial);
                pretFinal = valoareDiscountTipProdus * (1 - discountFidelitate);
                break;
            case STOC_LIMITAT:
                discount = TipProdus.STOC_LIMITAT.getDiscount();
                valoareDiscountTipProdus = getPretCuDiscount(pretInitial, discount * pretInitial);
                pretFinal = valoareDiscountTipProdus * (1 - discountFidelitate);
                break;
            case VECHI:
                discount = TipProdus.VECHI.getDiscount();
                valoareDiscountTipProdus = getPretCuDiscount(pretInitial, discount * pretInitial);
                pretFinal = valoareDiscountTipProdus * (1 - discountFidelitate);
                break;
            default:
                throw new UnsupportedOperationException("Un simbol din enumerare nu este procesat.");
        }
        return pretFinal;
    }

    private float getPretCuDiscount(float pretInitial, float v) {
        return pretInitial - (v);
    }

    private float getDiscountFidelitate(int vechimeClientInAni) {
        return (vechimeClientInAni > VECHIME_CLIENT_MAXIMA)
                ? DISCOUNT_CLIENT_MAXIM : (float) vechimeClientInAni / 100;
    }
}