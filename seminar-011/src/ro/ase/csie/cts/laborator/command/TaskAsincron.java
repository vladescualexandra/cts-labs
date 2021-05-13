package ro.ase.csie.cts.laborator.command;

public class TaskAsincron implements InterfataTaskAsincron {
    InterfataModulJoc modul = null;
    int prioritate;
    private String detalii;

    public TaskAsincron(InterfataModulJoc modul, String detalii, int prioritate) {
        this.modul = modul;
        this.detalii = detalii;
        this.prioritate = prioritate;
    }

    @Override
    public void startTaskAsincron() {
        this.modul.executaTask(detalii);
    }
}
