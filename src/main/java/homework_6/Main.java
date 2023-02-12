package homework_6;

import java.util.*;

//        1.Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        2.Создать множество ноутбуков (ArrayList).
//        3.Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//        Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//        Выводить только те ноутбуки, что соответствуют условию
public class Main {
    public static void main(String[] args) {

//        ArrayList<Laptop> catalog = catalog();
//       System.out.println(catalog);
        Map<Integer, String> valueSearch = menuSearch(menuChoice());

        searchLaptop(valueSearch, catalog());


    }

    private static ArrayList<Laptop> catalog() {
        Laptop lap1 = new Laptop("Lenovo", "White", 8, 20000);
        Laptop lap2 = new Laptop("Samsung", "Black", 16, 80500);
        Laptop lap3 = new Laptop("MSI", "Green", 8, 300000);

        ArrayList<Laptop> catalog = new ArrayList<>();
        Collections.addAll(catalog, lap1, lap2, lap3);
        return catalog;
    }

    private static Map<Integer, String> menuSearch(Map<Integer, String> menu) { //Исх
        Map<Integer, String> zapros = new HashMap<>();
        //System.out.println("Введите характеристику для поиска");
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Начать или продолжить запрос поиска да -y/нет - n");
            String yesorno = scan.next();
            if (yesorno.equals("n")) {
                break;

            } else if (yesorno.equals("y")) {
                System.out.println(menu);
                System.out.println("Выберите нужный пункт(цифра)");
                Integer key = scan.nextInt();
                System.out.println("Введите парамерт(слово или значение) запроса в зависимости от выбранного пункта");
                String value = scan.next();
                zapros.put(key, value);
                System.out.println(zapros);
            }

        }
        return zapros;
    }

    private static Map<Integer, String> menuChoice() {//
        Map<Integer, String> menu = new HashMap<>();
        menu.put(1, "brend");
        menu.put(2, "color");
        menu.put(3, "memory");
        menu.put(4, "price");
        return menu;
    }

    private static void searchLaptop(Map<Integer, String> zapros, ArrayList<Laptop> laptops) {
        Set<Laptop> resultPoiska = new HashSet<>(laptops);
        //System.out.println(resultPoiska);
        for (Laptop element : laptops) {
            for (int i : zapros.keySet()) {
                //System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                if (i == 1 && !element.getBrand().equals(zapros.get(i))) {
                    resultPoiska.remove(element);

                }
                for (int j : zapros.keySet()) {
                    if (j == 2 && !element.getColor().equals(zapros.get(j))) {
                        resultPoiska.remove(element);

                    }
                    for (int k : zapros.keySet()) {

                        String price = String.valueOf(element.getMemory());
                        if (k == 3 && !price.equals(zapros.get(k))) {
                            resultPoiska.remove(element);

                        }
                        for (int m : zapros.keySet()) {
                            String memory = Integer.toString(element.getPrice());
                            if (m == 4 && !memory.equals(zapros.get(m))) {
                                resultPoiska.remove(element);

                            }
                        }
                    }
                }
            }
        }
        System.out.println("____________________________________________________________");
        if (resultPoiska.isEmpty()) {
            System.out.println("По запросу совпадений нет!!!");
        } else {
            System.out.println(resultPoiska);
        }
    }

}