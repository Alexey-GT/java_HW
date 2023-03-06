package oop_homework_6;

import java.util.Scanner;

public class TaskView {
    public static String taskString(String name) {
        Scanner in = new Scanner(System.in);
        System.out.println("Описание для " + name + ":");
        return in.nextLine();
    }
}
