package com.whitecloak.ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> colors= new ArrayList<>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        printColors(colors);
    }

    private static void printColors(ArrayList<String> colors) {
        for(String name:colors){
            System.out.println(name);
        }
    }
}
