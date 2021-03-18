package ro.ase.csie.cts.laborator.faza3;

public enum TipProdus {
    NOU (0.0f),
    DISCOUNT (0.1f),
    STOC_LIMITAT (0.25f),
    VECHI (0.35f);

    private final float discount;

    TipProdus(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return this.discount;
    }
}
