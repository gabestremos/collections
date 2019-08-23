package com.whitecloak.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet<String> items=new HashSet<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        System.out.println("---HashSet---");
        printItems(items);
        System.out.println("Total number of elements: "+ items.size());
    }
    private static void printItems(HashSet<String> items){
        Iterator<String> iterator=items.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
