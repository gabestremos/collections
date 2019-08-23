package com.whitecloak.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> items=new ArrayList<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        iterate(items);
    }
    private static void iterate(ArrayList<String> items){
        Iterator iterator=items.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
