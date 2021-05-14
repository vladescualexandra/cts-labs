package decorator;

public class TestDecorator {

    public static void main(String[] args) {

        InterfataCaracterACME superman = new CaracterACME("Superman", 1000);
        InterfataCaracterACME batman = new CaracterACME("Batman", 1000);

        superman.esteAtacat(200);
        superman.getDescriere();

        DecoratorACME supermanCuScut = new DecoratorScut(superman, "scut tip1");
        supermanCuScut.esteAtacat(200);
        superman.getDescriere();

        DecoratorACME supermanRanitCritic = new DecoratorRanitCritic(supermanCuScut);
        supermanRanitCritic.esteAtacat(1600);
        superman.getDescriere();
    }
}
