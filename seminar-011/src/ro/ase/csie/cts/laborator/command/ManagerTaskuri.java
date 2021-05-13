package ro.ase.csie.cts.laborator.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerTaskuri {
    List<InterfataTaskAsincron> taskuri = new ArrayList<>();

    public void adaugaTask(InterfataTaskAsincron task) {
        taskuri.add(task);
    }

    public void executaUrmatorulTask() {
        if (taskuri.size() > 0) {
            InterfataTaskAsincron taskAsincron = taskuri.get(0);
            taskAsincron.startTaskAsincron();
            taskuri.remove(0);
        }
    }
}
