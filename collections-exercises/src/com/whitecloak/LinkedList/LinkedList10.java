package com.whitecloak.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList10 {
    public static void main(String[] args) {
        LinkedList<String> items=new LinkedList<>();
        items.add("Monitor");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        Scanner input=new Scanner(System.in);
        System.out.println(items);
        System.out.print("Enter item: ");
        String item=input.nextLine();
        System.out.println("The first occurrence of item "+item+" is at index: "+items.indexOf(item));
        System.out.println("The last occurrence of item "+item+" is at index: "+items.lastIndexOf(item));
    }
}
