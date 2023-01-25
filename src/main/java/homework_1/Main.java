package homework_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();

    }

    //. Задать одномерный массив и найти в нем минимальный и максимальный элементы
    private static void ex1() {
        int max = 0;
        int[] arr = new int[]{11, 54, 535, 33, 44};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    //Написать метод, который определяет, является ли введенный пользователем год високосным,
    // и возвращает в консоль boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static void ex2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число которое обозначает год");
        int num = scan.nextInt();
        boolean typeYear;
        typeYear = num % 4 == 0 && (num % 100 != 0 || num % 400 == 0);
        System.out.print(typeYear);
    }
    //Дан массив nums = [3,2,2,3] и число val = 3.
    //Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    //Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
    // а остальные - равны ему.
    private static void ex3() {
        int[] arr = new int[]{1, 4, 3, 5, 5, 3, 6, 3};
        int left = 0;
        int right = arr.length - 1;
        int val = 3;
        int temp;
        while (left < right) {
            if (arr[left] == val && arr[right] != val) {
                temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            } else if (arr[left] != val) {
                left++;
            } else if (arr[right] == val) {
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
