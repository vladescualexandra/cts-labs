package facade;

public class FacadeAPIJoc {

    public static void accesForum(String user, String pass) {
        Login login = new Login();
        login.login(user, pass);

        ForumJoc forum = new ForumJoc();
        Profil profil = new Profil();
        ConexiuneBD conexiuneBD = new ConexiuneBD();
        conexiuneBD.connect();
        profil.display();
        conexiuneBD.disconnect();
    }

    public static void setariJoc(String user, String pass) {
        Login login = new Login();
        login.login(user, pass);

        ConexiuneBD conexiuneBD2 = new ConexiuneBD();
        conexiuneBD2.connect();
        CaracterJoc caracterJoc = new CaracterJoc();
        conexiuneBD2.disconnect();
    }
}
