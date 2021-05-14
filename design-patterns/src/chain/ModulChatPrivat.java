package chain;

public class ModulChatPrivat extends ModulChatAbstract {
    public ModulChatPrivat(String numeModul) {
        super(numeModul);
    }

    @Override
    public void procesareMesajChat(MesajChat mesaj) {
        if (!mesaj.getDestinatar().isEmpty()) {
            System.out.println("Trimit mesajul catre: " + mesaj.getDestinatar());
            System.out.println(mesaj.getText());
            return;
        }

        if (this.next != null) {
            this.next.procesareMesajChat(mesaj);
        }
    }
}
