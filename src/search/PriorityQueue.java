package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = tasks.size();
        for (Task element : tasks) {
            if (task.getPriority() <= element.getPriority()) {
                index = tasks.indexOf(element);
                break;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
