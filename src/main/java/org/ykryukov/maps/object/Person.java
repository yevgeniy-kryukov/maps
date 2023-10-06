package org.ykryukov.maps.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Person implements Printable {
    final private int id;

    final private String name;
    final private String middleName;
    final private String lastName;

    final private List<String> phones;

    final private Address address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + getFullName() + '\'' +
                ", phones=" + phones +
                ", address=" + address +
                '}';
    }

    Person(int id, String name, String middleName, String lastName, List<String> phones, Address address) {
        this.id = id;
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phones = phones;
        this.address = address;
    }

    public Address getAddress() {
        return address.clone();
    }

    public List<String> getPhones() {
        return new ArrayList<>(phones);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getFullName() {
        return this.lastName.toUpperCase() + " " + this.name.toUpperCase() + " " + this.middleName.toUpperCase();
    }
}
