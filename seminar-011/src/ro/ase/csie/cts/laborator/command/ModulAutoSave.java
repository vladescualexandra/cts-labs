package ro.ase.csie.cts.laborator.command;

public class ModulAutoSave implements InterfataModulJoc {
    @Override
    public void executaTask(String detalii) {
        System.out.println("Autosave pentru " + detalii);
    }
}
