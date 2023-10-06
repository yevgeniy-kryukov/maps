package org.ykryukov.maps.object;

import java.util.*;

public class Main {
    private static void printMap(Map<Person, Status> map) {
//        Set<Person> keys = map.keySet();
//        for (Person key : keys) {
//            System.out.println(key + " => " + map.get(key));
//        }

        for(Map.Entry<Person,Status> el: map.entrySet()) {
            System.out.println(el.getKey() + "=>" + el.getValue());
        }
    }

    public static void main(String[] args) {
        Status status1 = new Status("junior class");
        Status status2 = new Status("middle class");
        Status status3 = new Status("senior class");

        Address address1 = new Address(1, "ERWTwdsfag", "1");
        Address address2 = new Address(2, "REWTWrt", "2");
        Address address3 = new Address(3, "xzCZXc", "9");
        Address address4 = new Address(4, "vcbxcvbxcvbass", "79");
        Address address5 = new Address(5, "TTGdfhfg", "88");

        Person person1 = new Person(1, "Tfghdf", "afasdfasdf", "sdfsdf",
                new ArrayList<String>(Arrays.asList("+745654445", "+781654655544")),
                address1);

        Person person2 = new Person(2, "QQSdsdff", "ssdfasdf", "sdfasdf",
                new ArrayList<String>(Arrays.asList("+76786786755", "+74567456745", "+75678567856")),
                address2);

        Person person3 = new Person(3, "QQSdsdff", "dsfgssdfg", "erqwrqwer",
                new ArrayList<String>(Arrays.asList("+73444324234")),
                address3);

        Person person4 = new Person(4, "EWRTWETRwetwert", "fsdgsdfg", "fdsgd",
                new ArrayList<String>(Arrays.asList("+7999988777")),
                address1);

        Person person5 = new Person(5, "qqqwwwwwEEE", "dfgsdfgsdfg s", "fgsdgfsdf",
                new ArrayList<String>(Arrays.asList("+76111111555")),
                address4);

        //address4.id = 44444444;
        System.out.println("address4.getHouse(): " + address4.getHouse());

        System.out.println(person1);
        Address address = person1.getAddress();
        address.setHouse("7777");
        List<String> phones = person1.getPhones();
        phones.add("+76666777");
        System.out.println(person1);

        Map<Person, Status> persons = new LinkedHashMap<Person, Status>();
        persons.put(person1, status1);
        persons.put(person2, status2);
        persons.put(person3, status3);
        persons.put(person1, status2);
        persons.put(person5, status3);

        System.out.println("вывести список персон");
        printMap(persons);
        System.out.println("-------------------");
    }
}