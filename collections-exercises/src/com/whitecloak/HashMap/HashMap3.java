package com.whitecloak.HashMap;

import java.util.HashMap;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<Integer,String> colors=new HashMap<>();
        colors.put(0,"Red");
        colors.put(1,"Blue");
        colors.put(2,"Yellow");
        colors.put(3,"Green");
        colors.put(4,"Black");
        HashMap<Integer,String> colorsCopy=new HashMap<>();
        colorsCopy.putAll(colors);
        System.out.println("---Copy of HashMap---");
        System.out.println(colorsCopy);

    }
}
