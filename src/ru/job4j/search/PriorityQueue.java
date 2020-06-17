package ru.job4j.search;

import java.util.LinkedList;
import ru.job4j.search.Task;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        var index = tasks.size();
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
