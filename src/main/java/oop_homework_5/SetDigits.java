package oop_homework_5;

import lombok.Getter;
import lombok.Setter;

public class  SetDigits {
    protected double x;
    protected double y;
    protected double a;
    protected double b;

    public void setX(double x) {
        this.x = x;
        Logger.logData("Записали число x: "+x);
    }

    public void setY(double y) {
        this.y = y;
        Logger.logData("Записали число y: "+y);
    }

    public void setA(double a) {
        this.a = a;
        Logger.logData("Записали мнимая часть числа x: "+ a);
    }

    public void setB(double b) {
        this.b = b;
        Logger.logData("Записали мнимая часть числа y: "+ b);
    }
}
