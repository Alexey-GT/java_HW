package oop_homework_6;

import java.util.Date;


public class Task implements Comparable<Task> {
    int id;
    String name;

    String description;

    Date created;

    Date deadline;

    Integer priority;

    String author;

    public Task(String name, String author, Integer id, int priority, String description, Date deadline) {
        this.name = name;
        this.author = author;
        this.id = id;
        this.priority = priority;
        this.created = new Date();
        this.description = description;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Задача ->  " +
                "id: " + id +
                ", Имя задачи: " + name +
                ", Описание: " + description +
                ", Время создания: " + created +
                ", Дата окончания: " + deadline +
                ", Приоритет: " + priority +
                ", Автор: " + author;
    }

    @Override
    public int compareTo(Task o) {
        if (this.getPriority() < o.getPriority()) {
            return -1;
        } else if (this.getPriority() < o.getPriority()) {
            return 0;
        } else {
            return 1;
        }
    }

}