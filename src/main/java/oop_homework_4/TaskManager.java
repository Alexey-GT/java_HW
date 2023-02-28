package oop_homework_4;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TaskManager<Object> {
    static HashMap<Integer, Task> taskList = new HashMap<>();

    public int lastID = 1;

    public void addTask(String name, String author, int priority) {  //создание и добавление задачи
        Task task = new Task(name, author, lastID, priority);
        taskList.put(lastID, task);
        lastID++;
        System.out.println("Task " + name + " by " + author + " created!");
    }

    public void saveData() {  // Записывает все задачи в файл
        try (PrintWriter out = new PrintWriter("tasks.txt")) {
            out.append(taskList.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showTasks() {  //Показывает задачи
        ArrayList<Task> val = new ArrayList<>(taskList.values());
        Collections.sort(val);
        for (int i = 0; i < val.size(); i++) {
            System.out.println(val.get(i));
        }
    }
}
