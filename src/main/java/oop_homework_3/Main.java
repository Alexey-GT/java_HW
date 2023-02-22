package oop_homework_3;

public class Main {
    public static void main(String[] args) {

        Relationships event = new Relationships();

        event.newPerson("Alexandr", "male");
        event.newPerson("Masha", "female");
        event.newPerson("Andrey", "male");
        event.newPerson("Tom", "male");
        //Вот тут сомнение по поводу пробела
        event.wedding(Relationships.persons.get("Alexandr"), Relationships.persons.get("Masha"));
        event.birth(Relationships.persons.get("Andrey"), Relationships.persons.get("Alexandr"));
        event.birth(Relationships.persons.get("Alexandr"), Relationships.persons.get("Tom"));
        System.out.println("Alexandr супруг " + event.persons.get("Alexandr").getHusband().getName());
        event.showParents("Tom");
        event.showChildren("Andrey");
    }
}
