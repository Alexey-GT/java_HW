package oop_homework_2;

public class Person extends Human {

    private Person husband;

    public Person(String name, String gender) {
        super(name, gender);
    }

    public void setHusband(Person husband) {
        this.husband = husband; ///Храним экземпляр класса противоположного пола
    }

    public Person getHusband() {
        return husband;
    }





}
