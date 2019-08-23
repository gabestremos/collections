package com.whitecloak.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> items=new ArrayList<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        System.out.print("Please enter a number(Index): ");
        int index=input.nextInt();
        System.out.println(items.get(index));

    }
}
