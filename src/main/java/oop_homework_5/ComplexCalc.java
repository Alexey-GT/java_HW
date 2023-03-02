package oop_homework_5;

public class ComplexCalc extends SetDigits implements Model<Complex> {

    @Override
    public Complex sum() {
        Logger.logData("Сумма комплексных чисел: ");
        return new Complex((x + a), (y + b));

    }

    @Override
    public Complex mult() {
        Logger.logData("Произведение комплексных чисел: ");
        return new Complex((x * a - y * b), (y * a + x * b));
    }

    @Override
    public Complex div() {
        Logger.logData("Частное комплексных чисел: ");
        return new Complex((x * a + y * b) / (y * y + b * b), (y * a - x * b) / (y * y + b * b));
    }

    @Override
    public Complex difference() {
        Logger.logData("Разность комплексных чисел: ");
        return new Complex(x - a, y - b);
    }
}
