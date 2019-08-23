package com.whitecloak.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> items=new ArrayList<>();
        System.out.println("---Original items---");
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        printItems(items);
        System.out.println();
        Scanner input=new Scanner(System.in);
        System.out.print("Add an item: ");
        String item=input.nextLine();
        items.add(0,item);
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
