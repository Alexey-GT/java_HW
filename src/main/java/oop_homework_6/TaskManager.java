package oop_homework_6;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TaskManager <ObjectMapper>{
    static HashMap<Integer, Task> taskList = new HashMap<>();

    public int lastID = 1;

    public void addTask(String name, String author, int priority) {
        Task task = new Task(name, author, lastID, priority, TaskView.taskString(name), DeadlineMaker.createDL(name));
        taskList.put(lastID, task);
        lastID++;
        System.out.println("Задача " + name + " автора " + author + " создана!");
    }

    public void saveData() {
        try (PrintWriter out = new PrintWriter("C:\\Users\\Alexey\\Desktop\\Java_Homework\\src\\main\\java\\oop_homework_6\\tasks.json")) {
            out.append(taskList.toString() + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showTasks() {
        ArrayList<Task> val = new ArrayList<>(taskList.values());
        Collections.sort(val);
        for (int i = 0; i < val.size(); i++) {
            System.out.println(val.get(i));
        }
    }
}