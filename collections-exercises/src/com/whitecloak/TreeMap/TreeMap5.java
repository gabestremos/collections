package com.whitecloak.TreeMap;


import java.util.TreeMap;

public class TreeMap5 {
    public static void main(String[] args) {
        TreeMap<Integer,String> colors=new TreeMap<>();
        colors.put(0,"Red");
        colors.put(1,"Blue");
        colors.put(2,"Yellow");
        colors.put(3,"Green");
        colors.put(4,"Black");
        printKeys(colors);
    }
    private static void printKeys(TreeMap<Integer,String> colors){
        for(Integer c:colors.keySet()){
            System.out.println(c);
        }
    }
}
