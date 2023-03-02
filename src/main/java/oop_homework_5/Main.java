package oop_homework_5;

public class Main {
    public static void main(String[] args) {

            Presenter presenter = new Presenter(new View(),new RatioCalc(), new ComplexCalc());
            presenter.calculate();
    }
}
