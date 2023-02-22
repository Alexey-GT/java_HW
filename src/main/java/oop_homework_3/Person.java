package oop_homework_3;

public class Person extends Human {

    private Person husband;

    public Person(String name, String gender) {
        super(name, gender);
    }

    public void setHusband(Person husband) {
        this.husband = husband; //Хранение экземпляр класса противоположного пола
    }

    public Person getHusband() {
        return husband;
    }
}
