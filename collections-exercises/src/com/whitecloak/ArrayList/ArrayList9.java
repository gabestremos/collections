package com.whitecloak.ArrayList;

import java.util.ArrayList;

public class ArrayList9 {
    public static void main(String[] args) {
        ArrayList<String> items=new ArrayList<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        System.out.println("---Original Items---");
        printItems(items);
        ArrayList<String> copyOfItems= new ArrayList<>();
        copyOfItems.addAll(items);
        System.out.println("---Copy of Items---");
        printItems(copyOfItems);
    }
    private static void printItems(ArrayList<String> items){
        for(String name:items){
            System.out.println(name);
        }
    }
}
