package com.whitecloak.ArrayList;

import java.util.ArrayList;

public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<String> items=new ArrayList<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        System.out.println("---Old items---");
        printItems(items);
        items.remove(2);
        System.out.println("---Updated items---");
        printItems(items);

    }
    private static void printItems(ArrayList<String> items){

        for(String item:items){
            System.out.println(item);
        }
    }
}
