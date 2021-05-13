package ro.ase.csie.cts.laborator.chain;

public abstract class ModulProcesareMesaj {

    ModulProcesareMesaj next = null;

    public abstract void procesareMesaj(MesajChat mesaj);

    public void setNext(ModulProcesareMesaj next) {
        if (next == null) {
            throw new NullPointerException();
        }
        this.next = next;
    }
}
