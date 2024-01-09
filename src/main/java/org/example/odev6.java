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
        ShoppingList.add("bread");
        ShoppingList.add("oil");
        ShoppingList.add("yogurt");

        ArrayList<String> ShoppingListRepeated = new ArrayList<>();

        for(String alinacak : ShoppingList){
            ArrayList<Character> repeatedCharacters = new ArrayList<>();
            for(int j = 0;j < alinacak.length() ; ++j){
                if(repeatedCharacters.contains(alinacak.charAt(j))){
                    ShoppingListRepeated.add(alinacak);
                    break;
                }else{
                    repeatedCharacters.add(alinacak.charAt(j));
                }
            }
        }

        for(String alinacak : ShoppingListRepeated)
            System.out.println(alinacak);


        /*for(int i = 0; i < ShoppingList.size(); ++i){
            String alinacak = ShoppingList.get(i);
            System.out.println(alinacak);
            for(int j = 0;j < alinacak.length() ; ++j){
               System.out.println(alinacak.charAt(j));
            }
        }*/


    }


}
