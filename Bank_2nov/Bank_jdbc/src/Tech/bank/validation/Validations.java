/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.bankproject.models;

/**
 *
 * @author HP
 */
public class Validations {
    public static boolean validateName(String name){
       String check[] = {"`","~","!","@","#","$","%","%","^","&","&","*","(",")","_","-","=","+","[","]","{","}",":",";","\"",",",".","/","\\","|","<",">","0","1","2","3","4","5","6","7","8","9"};
       for(String i : check){
           if(name.contains(i))
               return false;
       }
       return true;
    }
    public static boolean validateEmail(String email){
        if(email.contains("@gmail.com")){
            String val[] = {"`","~","!","@","#","$","%","%","^","&","&","*","(",")","_","-","=","+","[","]","{","}",":",";","\"",",",".","/","\\","|","<",">"};
            String check[] = email.split("@gmail.com");
            for( String s : check){
                for(String i: val ){
                    if(s.contains(i))
                        return false;
                }
            }
            return true;
        }
        else
            return false; 
    }
    public static boolean validateNumber(String number){
        Character ch[] = new Character[number.length()];
        for(int i=0;i<number.length();i++){
            ch[i]=number.charAt(i);
        }
        for(Character c : ch){
            if(!Character.isDigit(c))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        new Validations();
    }
}
