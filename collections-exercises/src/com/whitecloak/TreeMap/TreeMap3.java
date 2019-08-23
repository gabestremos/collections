package com.whitecloak.TreeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMap3 {
    public static void main(String[] args) {
        TreeMap<Integer,String> colors=new TreeMap<>();
        colors.put(0,"Red");
        colors.put(1,"Blue");
        colors.put(2,"Yellow");
        colors.put(3,"Green");
        colors.put(4,"Black");
        Scanner input=new Scanner(System.in);
        System.out.print("Search for a key: ");
        int key=input.nextInt();
        System.out.println("Is "+key+" present? "+ colors.containsKey(key));
    }


}
