package oop_homework_1;


import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.sound.midi.Soundbank;
import java.util.ArrayList;


public class Person {
    private String name;
    private int age;

    private String sex;
    private ArrayList<Person> parents = new ArrayList<>();

    private ArrayList<Person> childs = new ArrayList<>();
    private Person husband;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void isParent(Person name) {
        childs.add(name);
    }

    public void isChild(Person name) {
        parents.add(name);
    }

    public void isHusband(Person name) {
        this.husband = name;
    }

    public Person getHusband() {
        return husband;
    }

    public String getSex() {
        return sex;
    }

    public ArrayList<Person> getParents() {
        return parents;
    }

    public ArrayList<Person> getChilds() {
        return childs;
    }

    public void showChildrens() {
        System.out.print(name + ":дети -> ");

        for (int i = 0; i < childs.size(); i++) {
            System.out.print(childs.get(i).getName());
            if (i < childs.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void showParents() {
        System.out.print(name + ":родители -> ");

        for (int i = 0; i < parents.size(); i++) {
            System.out.print(parents.get(i).getName());
            if (i < parents.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void showGrandparents() {
        System.out.print(name + ":grandparents -> ");
        for (int i = 0; i < parents.size(); i++) {
            for (int j = 0; j < parents.get(i).getParents().size(); j++) {
                System.out.print(parents.get(i).getParents().get(j).getName());
                if (i < parents.size() - 1 || j < parents.get(i).getParents().size() - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }

    public void showGrandchilds() {
        System.out.print(name + ":внуки -> ");
        for (int i = 0; i < childs.size(); i++) {
            for (int j = 0; j < childs.get(i).getChilds().size(); j++) {
                System.out.print(childs.get(i).getChilds().get(j).getName());
                if (i < childs.size() - 1 || j < childs.get(i).getChilds().size() - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }

    public void showBrothers() {
        ArrayList<Person> temp = new ArrayList<>();
        for (int i = 0; i < parents.size(); i++) {
            for (int j = 0; j < parents.get(i).getChilds().size(); j++) {
                if (this != parents.get(i).getChilds().get(j) && !temp.contains(parents.get(i).getChilds().get(j))) {
                    temp.add(parents.get(i).getChilds().get(j));
                }
            }
        }
        System.out.print(name + ":братья и сестры -> ");
        for (int i = 0; i < temp.size(); i++) {
            System.out.print(temp.get(i).getName());
            if (i < temp.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }


}