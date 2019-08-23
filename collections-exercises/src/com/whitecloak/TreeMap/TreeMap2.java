package com.whitecloak.TreeMap;

import java.util.TreeMap;

public class TreeMap2 {
    public static void main(String[] args) {
        TreeMap<Integer,String> colors=new TreeMap<>();
        colors.put(0,"Red");
        colors.put(1,"Blue");
        colors.put(2,"Yellow");
        colors.put(3,"Green");
        colors.put(4,"Black");
        TreeMap<Integer,String> colorsCopy=new TreeMap<>();
        colorsCopy.putAll(colors);
        System.out.println(colorsCopy);
    }
}
