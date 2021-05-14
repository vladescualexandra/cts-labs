package chain;

public class ModulFiltru extends ModulChatAbstract {
    public ModulFiltru(String numeModul) {
        super(numeModul);
    }

    @Override
    public void procesareMesajChat(MesajChat mesaj) {
        String[] dictionar = {"rau", "ura"};

        for (String cuvant : dictionar) {
            if (mesaj.text.contains(cuvant)) {
                System.out.println("Filtrare mesaj: " + mesaj.getText());
                return;
            }
        }

        if (this.next != null) {
            this.next.procesareMesajChat(mesaj);
        }
    }
}
