package com.company;

public class Main {

    public static void main(String[] args) {
        Class klass = new Class(3,"Hello", new int[]{5,7,12});
        System.out.println("Class number: " + klass.getNumber());
        System.out.println("Class word: " + klass.getWord());
        for (int i: klass.getArray())
            System.out.println("Array: " + i);
    }
}
