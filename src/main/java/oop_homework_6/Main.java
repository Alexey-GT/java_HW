package oop_homework_6;


public class Main {
    public static void main(String[] args)  {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("Задача_1", "Vitaliy", 2);
        taskManager.addTask("Задача_2", "Andrey", 3);
        taskManager.addTask("Задача_3", "Masha", 1);
        taskManager.saveData();
        taskManager.showTasks();
    }
}
