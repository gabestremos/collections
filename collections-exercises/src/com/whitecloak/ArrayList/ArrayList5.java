package com.whitecloak.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        ArrayList<String> items=new ArrayList<>();
        System.out.println("---Original items---");
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        System.out.println();

        printItems(items);
        System.out.println();
        System.out.print("Element to be updated: ");
        String oldElement=input.nextLine();
        System.out.print("Set an element: ");
        String newElement=input.nextLine();
        for(String name:items){
            if(name.equals(oldElement)){
                items.set(items.indexOf(name),newElement);
            }
        }
        System.out.println();
        System.out.println("---Updated items---");
        printItems(items);

    }

    private static void printItems(ArrayList<String> items){
        for(String item:items){
            System.out.println(item);
        }
    }
}
