package ro.ase.csie.cts.laborator.proxy;

public class TestProxy {

    public static void main(String[] args) {

        InterfataLogin login = new ModulLogin("10.0.0.1");
        if (login.login("admin", "admin")) {
            System.out.println("Hello admin");
        }

        // Adaugam proxy.

        login = new ProxyLogin(login);

        String[] parole = new String[]{"1234", "root", "admin123", "root12", "admin"};

        for (String parola : parole) {
            if (login.login("admin", parola)) {
                System.out.println("Am gasit parola: " + parola);
            }
        }


    }
}
