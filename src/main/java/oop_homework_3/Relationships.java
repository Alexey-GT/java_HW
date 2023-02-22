package oop_homework_3;

import java.util.ArrayList;
import java.util.HashMap;

public class Relationships implements FamilyTree {

    /**
     * Список представителей генеалогического дерева, где ключом является имя
     */
    public static HashMap<String, Person> persons = new HashMap<>();

    /**
     * Список родителей, где ключами доступа являются имена детей
     */
    public HashMap<Person, ArrayList<Person>> parents = new HashMap();

    /**
     * Список детей, где ключами доступа являются имена родителей
     */
    public HashMap<Person, ArrayList<Person>> children = new HashMap();

    /**
     * Добавления людей (экземпляров класса)в список person по имени человека и полу,
     * где ключ-имя человека
     *
     * @param name   имя человека
     * @param gender пол
     */
    public void newPerson(String name, String gender) {
        persons.put(name, new Person(name, gender));
    }

    @Override
    public ArrayList<Person> getChildren(String name) {
        return children.get(persons.get(name));
    }

    @Override
    public void showChildren(String name) {
        System.out.print(name + " его/ее дети: ");
        for (int i = 0; i < getChildren(name).size(); i++) {
            System.out.print(getChildren(name).get(i).getName() + " ");
        }
        System.out.println();
    }

    @Override
    public ArrayList<Person> getParents(String name) {
        return parents.get(persons.get(name));
    }

    @Override
    public void showParents(String name) {
        System.out.print(name + " его/ее родители: ");
        for (int i = 0; i < getParents(name).size(); i++) {
            System.out.print(getParents(name).get(i).getName() + " ");
        }
        System.out.println();
    }

    @Override
    public void wedding(Person husband1, Person husband2) {
        if (!husband1.getGender().equalsIgnoreCase(husband2.getGender())) {
            husband1.setHusband(husband2);
            husband2.setHusband(husband1);
        }
    }

    @Override
    public void makeParent(Person parent, Person child) {
        if (parents.containsKey(child)) {
            if (!parents.get(child).contains(parent)) {
                parents.get(child).add(parent);
            }
        } else {
            parents.put(child, new ArrayList<Person>());
            parents.get(child).add(parent);
        }

        if (children.containsKey(parent)) {
            if (!children.get(parent).contains(child)) {
                children.get(parent).add(child);
            }
        } else {
            children.put(parent, new ArrayList<Person>());
            children.get(parent).add(child);
        }
    }

    @Override
    public void birth(Person parent, Person child) {
        makeParent(parent, child);
        if (parent.getHusband() != null) {
            makeParent(parent.getHusband(), child);
        }
    }
}