package ykryukov.maps.simple;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    private static void printMap(Map<Integer, String> map) {
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(map.get(key));
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> states = new LinkedHashMap<Integer,String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");

        System.out.println("вывести список");
        printMap(states);
        System.out.println("-------------------");

        System.out.println("получим объект по ключу 2");
        String second = states.get(2);
        System.out.println(second);
        System.out.println("-------------------");

        System.out.println("заменить элемент по ключу 2");
        states.replace(2, "Poland");
        printMap(states);
        System.out.println("-------------------");

        System.out.println("Hello world!");

    }
}