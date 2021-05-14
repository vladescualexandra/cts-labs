package command;

public class TestCommand {

    public static void main(String[] args) {

        System.out.println("Jocul ruleaza fara probleme.");

        TaskManager manager = new TaskManager();
        System.out.println("Lansare autosave");
        manager.adaugaTask(new TaskAsincron("Backup", 10000,
                new ModulBackupDate()));

        System.out.println("Jocul ruleaza fara probleme.");

        System.out.println("Lansare update forum");
        manager.adaugaTask(new TaskAsincron("Update forum", 2999,
                new ModulUpdateForum()));

        System.out.println("Jocul ruleaza fara probleme.");

        manager.executaTask();
        System.out.println("Jocul ruleaza fara probleme.");
        manager.executaTask();
        System.out.println("Jocul ruleaza fara probleme.");

    }
}
