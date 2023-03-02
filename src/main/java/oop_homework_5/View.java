package oop_homework_5;

import java.util.Scanner;

public class View {
    Scanner num = new Scanner(System.in);

    public double getValue(String title){
        System.out.println(title);
        return num.nextDouble();
    }
    public int choice(){
        return num.nextInt();
    }


}
