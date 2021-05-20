package ro.ase.csie.cts.laborator.observer;

public class TestObserver {

    public static void main(String[] args) {
        ModulStareConexiuneServer conexiuneServer = new ModulStareConexiuneServer();

        InterfataStatusConexiuneServer modulNotificari = new ModulNotificari();
        InterfataStatusConexiuneServer modulSalvareAutomata = new ModulSalvareAutomata();

        conexiuneServer.register(modulNotificari);
        conexiuneServer.register(modulSalvareAutomata);

        conexiuneServer.detectieSchimbareStareConexiune(StareConexiune.ACTIVA);

        conexiuneServer.unregister(modulNotificari);

        conexiuneServer.detectieSchimbareStareConexiune(StareConexiune.INACTIVA);
    }
}
