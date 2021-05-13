package ro.ase.csie.cts.laborator.command;

public class TestCommand {
    public static void main(String[] args) {
        ManagerTaskuri managerTaskuri = new ManagerTaskuri();

        managerTaskuri.adaugaTask(new TaskAsincron(new ModulUpdate(), "v10.1", 5));
        managerTaskuri.adaugaTask(new TaskAsincron(new ModulAutoSave(), "nivel 5", 1));

        System.out.println("Jocul continua...");
        managerTaskuri.executaUrmatorulTask();
        System.out.println("Jocul continua...");
        managerTaskuri.executaUrmatorulTask();
    }
}
