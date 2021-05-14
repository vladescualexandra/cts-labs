package chain;

public class ModulChatGlobal extends ModulChatAbstract {
    public ModulChatGlobal(String numeModul) {
        super(numeModul);
    }

    @Override
    public void procesareMesajChat(MesajChat mesaj) {
        if (mesaj.getDestinatar().equals("@everyone")) {
            System.out.println("Mesaj catre toti: " + mesaj.getText());
        }

        if (this.next != null) {
            this.next.procesareMesajChat(mesaj);
        }
    }
}
