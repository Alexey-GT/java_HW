package oop_homework_4;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("Test1", "Alexey", 3);
        taskManager.addTask("Test2", "Andrey ", 1);
        taskManager.addTask("Test3", "Vitaliy", 1);
        taskManager.saveData();
        taskManager.showTasks();
    }
}