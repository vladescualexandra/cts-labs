package decorator;

public class DecoratorRanitCritic extends DecoratorACME {
    public DecoratorRanitCritic(InterfataCaracterACME erou) {
        super(erou);
    }

    @Override
    public void esteAtacat(int puncte) {
        super.esteAtacat(puncte);
        if (this.erou.getPuncteViata() < 100) {
            System.out.println("Atentie! Este ranit critic.");
        }
    }
}
