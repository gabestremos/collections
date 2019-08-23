package com.whitecloak.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList9 {
    public static void main(String[] args) {
        LinkedList<String> items=new LinkedList<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        System.out.println("---Original LinkedList---");
        printItems(items);
        System.out.println();
        Scanner input=new Scanner(System.in);
        System.out.print("How many times you want to add an element? ");
        int i=input.nextInt();
        for(int x=0;x<i;x++){
            System.out.print("Enter specific index to add an element: ");
            int index=input.nextInt();
            System.out.print("Enter an element: ");
            String element=input.next();
            items.add(index,element);
        }
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
