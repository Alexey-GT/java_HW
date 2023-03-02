package oop_homework_5;

public class RatioCalc extends SetDigits implements Model<Ratio> {
    @Override
    public Ratio sum() {
        Logger.logData("Сумма рациональныx чисел: ");
        return new Ratio(x+y);
    }

    @Override
    public Ratio mult() {
        Logger.logData("Произведение рациональныx чисел: ");
        return new Ratio(x*y);
    }

    @Override
    public Ratio div() {
        Logger.logData("Частное рациональныx чисел: ");
        return new Ratio(x/y);
    }

    @Override
    public Ratio difference() {
        Logger.logData("Разность рациональныx чисел: ");
        return new Ratio(x-y);
    }
}
