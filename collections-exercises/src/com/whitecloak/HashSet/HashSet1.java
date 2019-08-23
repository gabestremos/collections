package com.whitecloak.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> items=new HashSet<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        System.out.println("---Original HashSet---");
        printItems(items);
        System.out.println();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an element to be added: ");
        String element=input.nextLine();
        items.add(element);
        System.out.println();
        System.out.println("---Updated HashSet---");
        printItems(items);

    }
    private static void printItems(HashSet<String> items){
        Iterator<String> iterator=items.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
