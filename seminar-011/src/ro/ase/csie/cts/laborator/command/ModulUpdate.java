package ro.ase.csie.cts.laborator.command;

public class ModulUpdate implements InterfataModulJoc {
    @Override
    public void executaTask(String detalii) {
        System.out.println("Update pentru " + detalii);
    }
}
