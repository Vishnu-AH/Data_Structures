package com.pace.datastructures.examples;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetsExample {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Red"));
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Yellow"));
        System.out.println("Size : "+balls.size());
        balls.forEach(System.out::println);
        balls.remove(new Ball("Red"));
        System.out.println("Size after deleting : "+balls.size());
        balls.forEach(System.out::println);
    }
//    record Ball(String color){
    static class Ball{
        String color;

    public Ball(String color) {
        this.color = color;
    }
    //Set will not allow duplicates when equals and hashcode are overridden
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Objects.equals(color, ball.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                '}';
    }
}
}
