package com.whitecloak.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> items=new LinkedList<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        iterate(items);
    }
    private static void iterate(LinkedList<String> items){
        Iterator iterator=items.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
