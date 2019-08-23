package com.whitecloak.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList8 {
    public static void main(String[] args) {
        ArrayList<String> items=new ArrayList<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        System.out.println("---UNSORTED---");
        printItems(items);
        System.out.println("---SORTED---");
        Collections.sort(items);
        printItems(items);
    }
    private static void printItems(ArrayList<String> items){
        for(String name:items){
            System.out.println(name);
        }
    }
}
