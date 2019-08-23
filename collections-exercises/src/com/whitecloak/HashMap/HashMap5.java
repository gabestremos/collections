package com.whitecloak.HashMap;

import java.util.HashMap;

public class HashMap5 {
    public static void main(String[] args) {
        HashMap<Integer,String> colors=new HashMap<>();
        colors.put(0,"Red");
        colors.put(1,"Blue");
        colors.put(2,"Yellow");
        colors.put(3,"Green");
        colors.put(4,"Black");
        System.out.println("Is HashMap empty? "+ colors.isEmpty());
    }
}
