package oop_homework_1;

public class Main {
    public static void main(String[] args) {
        Person Andrey = new Person("Andrey", 56, "male");
        Person Maria = new Person("Maria", 55, "female");
        Person Victor = new Person("Victor", 90, "male");

        Person Daniil = new Person("Daniil",84,"male");
        Person Alexandr = new Person("Alexandr", 25, "male");
        Person Masha = new Person("Masha", 24, "female");
        Person Tom = new Person("Tom", 6, "male");
        Person Lera = new Person("Dasha", 4, "female");

        Person Lena = new Person("Lena", 32, "female");
        Person Alexey = new Person("Alexey", 37, "male");
        Person Igor = new Person("Igor", 5, "male");
        Person Ira = new Person("Ira", 3, "female");

        Relationships wedding = new Relationships();
        wedding.marriage(Andrey, Maria);
        wedding.marriage(Lena, Alexey);
        wedding.marriage(Alexandr, Masha);

        Relationships birth = new Relationships();
        birth.makeParent(Victor, Masha);
        birth.makeParent(Andrey, Alexandr);
        birth.makeParent(Maria, Alexey);
        birth.makeParent(Alexey, Igor);
        birth.makeParent(Lena, Ira);
        birth.makeParent(Alexandr, Tom);
        birth.makeParent(Alexandr, Lera);


        Lena.showChildrens();
        Ira.showParents();
        Ira.showGrandparents();
        Maria.showGrandchilds();
        Tom.showBrothers();
        Alexey.showParents();
    }


}