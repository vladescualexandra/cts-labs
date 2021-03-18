package ro.ase.csie.cts.laborator.faza3.servicii;

public interface InterfataMarketing {

    public static final int VECHIME_CLIENT_MAXIMA = 10;
    public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;

    default float getDiscountFidelitate(int vechimeClientInAni) {
        return (vechimeClientInAni > VECHIME_CLIENT_MAXIMA)
                ? DISCOUNT_CLIENT_MAXIM : (float) vechimeClientInAni / 100;
    }
}
