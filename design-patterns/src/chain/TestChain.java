package chain;

public class TestChain {

    public static void main(String[] args) {

        ModulChatPrivat modulChatPrivat = new ModulChatPrivat("privat");
        ModulChatGlobal modulChatGlobal = new ModulChatGlobal("global");
        ModulFiltru modulFiltru = new ModulFiltru("filtru");

        modulFiltru.setNext(modulChatPrivat);
        modulChatPrivat.setNext(modulChatGlobal);

        ModulChatAbstract chat = modulFiltru;

        chat.procesareMesajChat(new MesajChat("Salut!", 1, "@gigel"));
        chat.procesareMesajChat(new MesajChat("rau!", 1, "@everyone"));
        chat.procesareMesajChat(new MesajChat("hey!", 1, "@everyone"));


    }
}
