package homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ex1();
        ex2();
    }

    private static void ex1() {
//        2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
//        и среднее арифметическое из этого списка.
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        System.out.print("Введите число определяющее длину списка: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++) {
            arrayList.add(random.nextInt(100 - 1) + 1);//метод nextInt - генерация случ.числа
        }
        System.out.println(arrayList);
        System.out.println("Min = " + Collections.min(arrayList));
        System.out.println("Max = " + Collections.max(arrayList));
        for (int j = 0; j < arrayList.size(); j++) {
            count += arrayList.get(j);
        }
        System.out.println("Среднее арифметическое элементов списка: " + (double) count / num);
    }

    private static void ex2() {
// Пусть дан произвольный список целых чисел, удалить из него четные числа
// (в языке уже есть что-то готовое для этого)
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        System.out.print("Введите число определяющее длину списка: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            arrayList.add(random.nextInt(100 - 1) + 1);
        }
        System.out.println("Созданный список " + arrayList);

        arrayList.removeIf(x -> (x % 2 == 0));

        System.out.println("Новый список " + arrayList);
    }
}
