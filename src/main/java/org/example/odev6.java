package org.example;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class odev6 {
    ArrayList<String> ShoppingList;
    public odev6(){
        ShoppingList = new ArrayList<String>();

        ShoppingList.add("butter");
        ShoppingList.add("egg");
        ShoppingList.add("bitter");
        ShoppingList.add("bread");
        ShoppingList.add("oil");
        ShoppingList.add("yogurt");

        String metin = "";

        for(String alinacak : ShoppingList){
            ArrayList<Character> repeatedCharacters = new ArrayList<>();
            String r = "";
            for(int i = 0; i < alinacak.length(); ++i){
                char al = alinacak.charAt(i);
                if(repeatedCharacters.contains(al)){
                    if(!r.contains("" + al))
                        r = r + al;
                }else{
                    repeatedCharacters.add(al);
                }
            }
            metin = metin + r;
        }
        System.out.println(metin);


    }


}
