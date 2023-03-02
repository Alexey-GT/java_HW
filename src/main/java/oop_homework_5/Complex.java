package oop_homework_5;

public class Complex extends SetDigits {
    public Complex(double d, double m) {
        this.x = d;
        this.y = m;
        Logger.logData("Комплексное число" + x + " , " + y + "i создано ");
    }
}



