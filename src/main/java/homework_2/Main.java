package homework_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
        //ex2();
    }

    private static void ex1() {
//    1. Напишите метод, который принимает на вход строку (String) и определяет
//    является ли строка палиндромом (возвращает boolean значение).
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите палиндром ");
        String str = scan.nextLine();
        int count = 0;
        char[] ch = str.toCharArray();
        int reverse = ch.length;
        boolean what;

        while (reverse / 2 >= count) {
            if (ch[count] == ch[reverse - 1]) {
                count++;
                reverse--;

            } else {
                break;
            }
        }
        what = ch[count] == ch[reverse - 1];
        System.out.println(what);

    }
//    2.Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//    который запишет эту строку в простой текстовый файл, обработайте исключения.
    private static void ex2() {
        addTEST();
        writeFile();
        }
    static StringBuilder addTEST( ){
        StringBuilder sb = new StringBuilder();
        sb.append("TEST ".repeat(100));


//        String str = "TEST ";
//        String strTest = " ";
//        int counter = 100;
//        while (counter > 0) {
//            strTest += str;
//            counter--;
        return sb;
    }
    static void writeFile(){
        try (FileWriter fw = new FileWriter("src/main/java/homework_2/text.txt",false)){
            fw.append(addTEST());
        } catch (IOException ex){
            //ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

        System.out.println(addTEST());
    }





}