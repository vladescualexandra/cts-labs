package memento;

public class TestMemento {

    public static void main(String[] args) {
        SuperErou superman = new SuperErou("Superman", 100, "zboara");

        ManagerIstoric managerIstoric = new ManagerIstoric();
        managerIstoric.adaugaSalvare(superman.salvare());

        superman.esteLovit(10);
        superman.esteLovit(50);

        System.out.println("Puncte viata: " + superman.puncteViata);

        superman.incarcaSalvare(managerIstoric.getUltimaSalvare());
        System.out.println("Puncte viata: " + superman.puncteViata);
    }
}
