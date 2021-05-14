package facade;

public class TestFacade {

    public static void main(String[] args) {
        // Acces forum.
        Login login = new Login();
        login.login("user", "pass");

        ForumJoc forum = new ForumJoc();
        Profil profil = new Profil();
        ConexiuneBD conexiuneBD = new ConexiuneBD();
        conexiuneBD.connect();
        profil.display();
        conexiuneBD.disconnect();

        // Modificarea setarilor jocului.
        Login login2 = new Login();
        login2.login("user", "pass");
        ConexiuneBD conexiuneBD2 = new ConexiuneBD();
        conexiuneBD2.connect();
        CaracterJoc caracterJoc = new CaracterJoc();
        conexiuneBD2.disconnect();


        FacadeAPIJoc.accesForum("user", "pass");
        FacadeAPIJoc.setariJoc("user", "pass");
    }
}
