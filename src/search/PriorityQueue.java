package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = tasks.size();
        for (int i = 0; i < tasks.size(); i++) {
            if (task.getPriority() <= tasks.get(i).getPriority()) {
                index = i;
                break;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
