package com.whitecloak.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList<String> items=new LinkedList<>();
        Scanner input=new Scanner(System.in);
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        System.out.println("---Original LinkedList---");
        printItems(items);
        System.out.println();
        System.out.print("Enter specific index to add an element: ");
        int index=input.nextInt();
        System.out.print("Enter a value: ");
        String value=input.next();
        items.add(index,value);
        System.out.println();
        System.out.println("---Updated LinkedList---");
        printItems(items);
    }
    private static void printItems(LinkedList<String> items){
        for(String name:items){
            System.out.println(name);
        }
    }
}
