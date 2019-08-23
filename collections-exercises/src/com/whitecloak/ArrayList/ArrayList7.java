package com.whitecloak.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String> items=new ArrayList<>();
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Monitor");
        items.add("Earphone");
        System.out.print("Search:");
        String searchItem=input.nextLine();
        int ctr=0;
        for(String name:items){
            if(name.contains(searchItem)){
                System.out.println(name + " is at index " + items.indexOf(name) +"!");
                ctr++;
            }
        }
        if(ctr==0){
            System.out.println("No data available!");
        }
    }
}
