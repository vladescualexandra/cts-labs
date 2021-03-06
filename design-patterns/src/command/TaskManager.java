package command;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    List<TaskAsincronAbstract> taskuri = new ArrayList<>();

    public void adaugaTask(TaskAsincronAbstract task) {
        taskuri.add(task);
    }

    public void executaTask() {
        if (this.taskuri.size() > 0) {
            TaskAsincronAbstract task = taskuri.get(0);
            taskuri.remove(0);
            task.executaTask(1);
        }
    }
}
