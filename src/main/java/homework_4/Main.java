package homework_4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
        //ex2();
    }

    //1. Реализовать консольное приложение, которое:
    //Принимает от пользователя и “запоминает” строки.
    //Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    //Если введено revert, удаляет предыдущую введенную строку из памяти.
    private static void ex1() {
        LinkedList<String> wordsList = new LinkedList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку");
            String inpytString = in.nextLine();

            if (!inpytString.equals("print") && !inpytString.equals("revert")) {
                wordsList.add(inpytString);
            }
            if (inpytString.equals("print")) {
//                String firstString = wordsList.pollFirst();///Вариант 2
//                String lastString = wordsList.pollLast();
//               wordsList.offerFirst(lastString);
//               wordsList.offerLast(firstString);
                String firstString = wordsList.removeFirst();
                String lastString = wordsList.removeLast();
                wordsList.addFirst(lastString);
                wordsList.addLast(firstString);
            }
            if (inpytString.equals("revert")) {
                wordsList.remove(wordsList.size() - 1);
            }
            System.out.println(wordsList);
        }
    }

    //2. Пусть дан LinkedList с несколькими элементами.
    // Реализуйте метод, который вернет “перевернутый” список.
    public static void ex2() {
//        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        LinkedList<Integer>linkedFirst = new LinkedList<>();
        LinkedList<Integer>linkedSecond = new LinkedList<>();

        System.out.print("Введите размер коллекции: ");

        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        Random rand = new Random();

        for (int i = 0; i < value; i++) {
            int randomNum = rand.nextInt((10 - 1) + 1) + 1;
            linkedFirst.add(randomNum);
        }
        System.out.println(linkedFirst);

        for (int j = linkedFirst.size() - 1; j >= 0; j--) {
            linkedSecond.add(linkedFirst.get(j));
        }
        System.out.println(linkedSecond);
    }

}