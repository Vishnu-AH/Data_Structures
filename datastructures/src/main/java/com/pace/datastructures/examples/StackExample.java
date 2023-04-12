package com.pace.datastructures.examples;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Last element of the stack : "+stack.peek());
        System.out.println("Size of the stack : "+stack.size());
        System.out.println("Element removed from stack : "+stack.pop());
        System.out.println("Size of stack after removing an element : "+stack.size());
        System.out.println("Stack empty : "+stack.empty());
    }
}
