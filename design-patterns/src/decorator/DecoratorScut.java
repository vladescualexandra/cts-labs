package decorator;

public class DecoratorScut extends DecoratorACME {

    String scut;

    public DecoratorScut(InterfataCaracterACME erou, String scut) {
        super(erou);
        this.scut = scut;
    }

    @Override
    public void esteAtacat(int puncte) {
        System.out.println("Se apara cu un scut: " + scut);
        super.esteAtacat(puncte / 2);
    }


}
