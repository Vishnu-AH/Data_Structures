package com.pace.datastructures.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashFunction {
    public static void main(String[] args) {
        Map<Person,Diamond> map = new HashMap<>();
        map.put(new Person("Vishnu"),new Diamond("Kohinooor"));

        //Hashcode varies if the hashcode and equals method are not overridden
        System.out.println(new Person("Vishnu").hashCode());
        System.out.println(new Person("Vishnu").hashCode());

        System.out.println(map.get(new Person("Vishnu")));
    }
    static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    record  Diamond(String name){}
}
