package com.pace.datastructures.examples;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        //Collection of key value pairs
        Map<Integer,Person> map = new HashMap<>();
        map.put(1,new Person("Harsha"));
        map.put(2,new Person("Radha"));
        map.put(3,new Person("Bheem"));
        map.put(4,new Person("Bheem"));//Duplicate key is not allowed but value is allowed
        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.get(3));

        System.out.println(map.containsKey(5));

        System.out.println(map.entrySet());

        System.out.println(map.keySet());

        map.remove(4);

        map.entrySet().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));

        map.forEach((key, person) -> {
            System.out.println(key+" - "+person);
        });

        System.out.println(map.getOrDefault(4,new Person("Kushal")));

        System.out.println(map.values());



    }
    record  Person(String name){}
}
