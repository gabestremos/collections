package com.whitecloak.TreeSet;

import java.util.TreeSet;

public class TreeSet4 {
    public static void main(String[] args) {
        TreeSet<String> colors= new TreeSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");
        TreeSet<String> reverseColor=(TreeSet<String>)colors.descendingSet();
        System.out.println("---Original TreeSet---");
        System.out.println(colors);
        System.out.println();
        System.out.println("---Reversed TreeSet---");
        System.out.println(reverseColor);
    }
}
