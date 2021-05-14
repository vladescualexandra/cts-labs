package chain;

public abstract class ModulChatAbstract {

    ModulChatAbstract next;
    String numeModul;

    public ModulChatAbstract(String numeModul) {
        this.numeModul = numeModul;
    }

    public void setNext(ModulChatAbstract next) {
        if (next == null) {
            throw new NullPointerException();
        }
        this.next = next;
    }

    public abstract void procesareMesajChat(MesajChat mesaj);
}
