package oop_homework_5;

import java.util.Set;

public class Presenter {
    View view;
    ComplexCalc complexCalc;
    RatioCalc ratioCalc;

    public Presenter(View v, RatioCalc m, ComplexCalc c) {
        this.view = v;
        this.ratioCalc = m;
        this.complexCalc = c;
    }

    public void calculate() {
        System.out.println("Для выполнения вычислений с комплексными числами нажмите 1," +
                "с рациональными нажмите 2 "); ///Вынести во View c возвратом значения в switch
        //Разделить вызовы методов Компл и рац чисел
        switch (view.choice()) {
            case (1):
                complexCalc.setX(view.getValue("Введите действительную часть первого комплексного числа: "));
                complexCalc.setY(view.getValue("Введите действительную часть второго комплексного числа: "));
                complexCalc.setA(view.getValue("Введите мнимую часть первого комплексного числа: "));
                complexCalc.setB(view.getValue("Введите мнимую часть второго комплексного числа: "));
                System.out.println("Выберите тип арифметической операции:\n" +
                        "1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление ");
                switch (view.choice()) {
                    case (1):
                        complexCalc.sum();
                        //System.out.println("Сумма чисел равна: " + complexCalc.sum());
                        break;
                    case (2):
                        complexCalc.difference();
                        //System.out.println("Разность чисел равна: " + complexCalc.difference());
                        break;
                    case (3):
                        complexCalc.mult();
                        //System.out.println("Произведение чисел равно: " + complexCalc.mult());
                        break;
                    case (4):
                        complexCalc.div();
                        //System.out.println("Частное чисел равно: " + complexCalc.div());
                        break;
                }
                break;
            case (2):
                ratioCalc.setX(view.getValue("Введите первое число: "));
                ratioCalc.setY(view.getValue("Введите второе число: "));
                System.out.println("Выберите тип арифметической операции:\n" +
                        "1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление ");
                switch (view.choice()) {
                    case (1):
                        ratioCalc.sum();
                        //System.out.println("Сумма чисел равна: " + ratioCalc.sum());
                        break;
                    case (2):
                        ratioCalc.difference();
                        //System.out.println("Разность чисел равна: " + ratioCalc.difference());
                        break;
                    case (3):
                        ratioCalc.mult();
                        //System.out.println("Произведение чисел равна: " + ratioCalc.mult());
                        break;
                    case (4):
                        ratioCalc.div();
                        //System.out.println("Частное чисел равна: " + ratioCalc.div());
                        break;
                }
                break;
        }

    }
}