package oop_homework_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Relationships implements Metods {

    public static HashMap<String, Person> persons = new HashMap<>();  // Хранение всех представителей класса

    public HashMap<Person, ArrayList<Person>> parents = new HashMap();  // список родителей по ключам дети

    public HashMap<Person, ArrayList<Person>> children = new HashMap(); //Список детей по ключам родители


    public void newPerson(String name, String gender) {
        persons.put(name, new Person(name, gender));
    }

    @Override    // Возвращает список экземпляров детей из общего списка persons
    public ArrayList<Person> getChildren(String name) {
        return children.get(persons.get(name));
    }
//    public void foo (String name){
//        System.out.println(getChildren(name));

    @Override   // Поиск детей у родителя и вывод их в консоль
    public void showChildren(String name) {
        System.out.print(name + " его/ее дети: ");
        for (int i = 0; i < getChildren(name).size(); i++) {
            System.out.print(getChildren(name).get(i).getName() + " ");
        }
        System.out.println();
    }

    @Override   // Возвращает список экземпляров родителей, в списке экземпляры класса Person
    public ArrayList<Person> getParents(String name) {
        return parents.get(persons.get(name));
    }

    @Override  // Выводит список родителей в консоль
    public void showParents(String name) {
        System.out.print(name + " его/ее родители: ");
        for (int i = 0; i < getParents(name).size(); i++) {
            System.out.print(getParents(name).get(i).getName() + " ");
        }
        System.out.println();
    }

    @Override  // Создает пару муж-жена
    public void wedding(Person husband1, Person husband2) {
        if (!husband1.getGender().equalsIgnoreCase(husband2.getGender())) {
            husband1.setHusband(husband2);
            husband2.setHusband(husband1);
        }
    }


    @Override //заполнение HashMap <Person,ArrayList<Person>> parents и children
    // Создаем связь ребенок - родители и родитель - дети
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

    @Override  // Создает связь родитель - ребенок и ребенок - родитель, проверяет наличие супруга,
    // при наличии автоматически создает связи ребенка с ним
    public void birth(Person parent, Person child) {  //
        makeParent(parent, child);
        if (parent.getHusband() != null) {
            makeParent(parent.getHusband(), child);
        }
    }


}