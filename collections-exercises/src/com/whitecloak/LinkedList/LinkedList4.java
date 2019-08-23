package com.whitecloak.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<String> items=new LinkedList<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        System.out.println("---Original LinkedList---");
        printItems(items);
        System.out.println();
        System.out.println("---Reverse iterate---");
        reverseIterate(items);
    }
    private static void printItems(LinkedList<String> items){
        for(String name:items){
            System.out.println(name);
        }
    }
    private static void reverseIterate(LinkedList<String> items){
        ListIterator listIterator=items.listIterator(items.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
