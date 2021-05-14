package command;

public class TaskAsincron extends TaskAsincronAbstract {

    // stare specifica task-ului
    int timeout;

    // referinta catre executant
    InterfataModuleJoc modul;

    public TaskAsincron(String denumireTask,
                        int timeout,
                        InterfataModuleJoc modul) {
        super(denumireTask);
        this.timeout = timeout;
        this.modul = modul;
    }

    @Override
    public void executaTask(int prioritate) {
        this.modul.executaActiune();
    }
}
