package oop_homework_3;

import java.util.ArrayList;

public interface FamilyTree {

    /**
     * Создание связи муж-жена
     */
    void wedding(Person husband1, Person husband2);

    /**
     * Создание связи родитель - ребенок и ребенок - родитель.
     * При наличии супруга автоматически создает связь между ними
     */
    void birth(Person parent, Person child);

    /**
     * Заполнение списков parents и children.
     * Создание связи ребенок - родители и родитель - дети
     */
    void makeParent(Person parent, Person child);

    /**
     * Возвращает список детей (экземпляров класса) из общего списка persons
     */
    ArrayList getChildren(String name);

    /**
     * Поиск детей по имени родителя и вывод их в консоль
     *
     * @param name имя предполагаемого родителя
     */
    void showChildren(String name);

    /**
     * Возвращает список родителей (экземпляров класса) из общего списка persons
     */
    ArrayList getParents(String name);

    /**
     * Поиск родителей по имени ребенка и вывод их в консоль
     *
     * @param name имя предполагаемого ребенка
     */
    void showParents(String name);
}
