package com.whitecloak.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<String> colors= new TreeSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");
        printColors(colors);
    }
    private static void printColors(TreeSet<String> colors){
        Iterator<String> iterator=colors.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
