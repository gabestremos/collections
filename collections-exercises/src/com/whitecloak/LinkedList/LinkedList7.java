package com.whitecloak.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList7 {
    public static void main(String[] args) {
        LinkedList<String> items=new LinkedList<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        System.out.println("---Original LinkedList---");
        printItems(items);
        Scanner input=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter an element to be added at the front of LinkedList: ");
        String addElement=input.nextLine();
        items.add(0,addElement);
        System.out.println("---Updated LinkedList---");
        printItems(items);
    }

    private static void printItems(LinkedList<String> items){
        for(String name:items){
            System.out.println(name);
        }
    }
}
