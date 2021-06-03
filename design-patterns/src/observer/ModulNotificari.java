package observer;

public class ModulNotificari implements InterfataStatusConexiuneServer {
    @Override
    public void conexiuneIntrerupta() {
        System.out.println("Popup: Conexiune pierduta.");
    }

    @Override
    public void conexiuneActiva() {
        System.out.println("Popup: Conexiune activa.");
    }
}
