package com.whitecloak.HashSet;

import java.util.HashSet;

public class HashSet5 {
    public static void main(String[] args) {
        HashSet<String> items=new HashSet<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        System.out.println("Is HashSet empty? "+ items.isEmpty());
    }
}
