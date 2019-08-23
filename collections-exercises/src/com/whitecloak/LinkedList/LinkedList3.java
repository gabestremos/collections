package com.whitecloak.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> items=new LinkedList<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        listIterate(items);
    }
    private static void listIterate(LinkedList<String> items){
        Scanner input= new Scanner(System.in);
        System.out.print("Iterate starting position: ");
        int specificIndex=input.nextInt();
        ListIterator listIterator=items.listIterator(specificIndex);
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
