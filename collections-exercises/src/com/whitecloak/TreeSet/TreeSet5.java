package com.whitecloak.TreeSet;

import java.util.TreeSet;

public class TreeSet5 {
    public static void main(String[] args) {
        TreeSet<String> colors= new TreeSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println("First element in TreeSet: "+ colors.first());
        System.out.println("Last element in TreeSet: "+colors.last());
    }
}
