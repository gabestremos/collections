package com.whitecloak.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList6 {
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
        System.out.print("Enter an element to add at the first position: ");
        String firstElement=input.nextLine();
        items.addFirst(firstElement);
        System.out.print("Enter an element to add at the last position: ");
        String lastElement=input.next();
        items.addLast(lastElement);
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
