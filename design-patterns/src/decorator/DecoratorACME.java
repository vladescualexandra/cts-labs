package decorator;

public abstract class DecoratorACME implements InterfataCaracterACME {

    InterfataCaracterACME erou;

    public DecoratorACME(InterfataCaracterACME erou) {
        this.erou = erou;
    }

    @Override
    public String getNume() {
        return this.erou.getNume();
    }

    @Override
    public int getPuncteViata() {
        return this.erou.getPuncteViata();
    }

    @Override
    public void getDescriere() {
        this.erou.getDescriere();
    }

    @Override
    public void esteAtacat(int puncte) {
        this.erou.esteAtacat(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        this.erou.seVindeca(puncte);
    }
}
