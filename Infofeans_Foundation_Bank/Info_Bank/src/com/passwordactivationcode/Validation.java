/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.passwordactivationcode;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Parth
 */
public class Validation {
public static boolean isValidName(String name) {
        // Regular expression to match letters and spaces only
        String regex = "^[a-zA-Z\\s]+$";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(name);

        // Check if the name matches the regex
        return matcher.matches();
    }
    public static String Contact(Scanner sc) {
        System.out.print("\t\t Enter the countact Number : ");
        String contact = sc.next();
        while (true) {
            boolean flag5 = true;
            if (contact.length() == 10) {
                char ch[] = contact.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    if (ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3'
                            || ch[i] == '4' || ch[i] == '5' || ch[i] == '6'
                            || ch[i] == '7' || ch[i] == '8' || ch[i] == '9') {
                        continue;
                    } else {
                        //
                        flag5 = false;
                        break;
                    }
                }
                if (!flag5) {
                    System.out.print("\t\t Please enter only digit : ");
                    contact = sc.next();
                } else {
                    break;
                }
            } else {
                System.out.print(
                        "\t\t **Contact number must be equal 10 digit** \n \t\t re-enter again : ");
                contact = sc.next();
            }
        }
        return contact;
    }

    public static String aadhar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\t Enter Aadhar No. : ");
        String aadhar = sc.next();
        while (true) {
            boolean flag6 = true;
            if (aadhar.length() == 12) {
                char ch[] = aadhar.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    if (ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3'
                            || ch[i] == '4' || ch[i] == '5' || ch[i] == '6'
                            || ch[i] == '7' || ch[i] == '8' || ch[i] == '9') {
                        continue;
                    } else {
                        System.out.println(
                                "\t\t **Please enter only digits **");
                        flag6 = false;
                        break;
                    }
                }
                if (!flag6) {
                    aadhar = sc.next();
                } else {
                    break;
                }
            } else {
                System.out.print(
                        "\t\t **Aadhar number must be equal 12 digit** \n\t\t re-enter again : ");
                aadhar = sc.next();
            }
        }
        return aadhar;
    }
    
     public static String accNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\t Enter Account No. : ");
        String account = sc.next();
        while (true) {
            boolean flag6 = true;
            if (account.length() == 11) {
                char ch[] = account.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    if (ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3'
                            || ch[i] == '4' || ch[i] == '5' || ch[i] == '6'
                            || ch[i] == '7' || ch[i] == '8' || ch[i] == '9') {
                        continue;
                    } else {
                        System.out.println(
                                "\t\t **Please enter only digits **");
                        flag6 = false;
                        break;
                    }
                }
                if (!flag6) {
                    account = sc.next();
                } else {
                    break;
                }
            } else {
                System.out.print(
                        "\t\t **Invalid account number** \n\t\t re-enter again : ");
                account = sc.next();
            }
        }
        return account;
    }
     public static int age(Scanner sc){
         int age = 0;
         boolean check = true;
         while(check){
          System.out.print("\t\t Enter the age : ");
         age = sc.nextInt();
         if(age<21 && age>57){
             System.out.println("\t\t Age must be > 21 and < 58 ");
             continue;
         }
         else return age;
         }
        return age;
     }
     
     public static int Duration(Scanner sc){
         int duration = 0;
         boolean check = true;
         while(check){
          System.out.print("\t\t Enter the duration (in year): ");
         duration = sc.nextInt();
         if(duration<=0){
             System.out.println("\t\t Invalid Duration time ");
             continue;
         }
         else return duration;
         }
        return duration;
     }
     
    public static boolean validatePAN(String pan) {
        // Regular expression for PAN card format
        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        // Compile the regular expression pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the input against the pattern
        Matcher matcher = pattern.matcher(pan);

        // Check if the PAN card number is valid
        if(matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidDOB(String dob) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Define your desired date format
            LocalDate date = LocalDate.parse(dob, formatter);

            // Check if the date is not in the future (assuming today is the upper limit)
            LocalDate currentDate = LocalDate.now();

            return !date.isAfter(currentDate);
        } catch (DateTimeParseException e) {
            return false; // Parsing error, invalid date format
        }
    }

    public static boolean isValidGmailAddress(String email) {
        Scanner input = new Scanner(System.in);

        // Define the regular expression pattern for a Gmail address
        String regex = "^[a-zA-Z0-9._%+-]+@gmail.com$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(email);

        // Check if the email matches the pattern
        return matcher.matches();
    }
    public static double amount() {
        Scanner sc = new Scanner(System.in);
        double amount = 0.0;
        while (true) {
            try {
                System.out.println("\t\t Enter amount : ");
                amount = sc.nextDouble();

                while (true) {
                    if (amount < 0)
                        throw new Exception();
                    else
                        break;
                }
                break;

            } catch (Exception e) {
                System.out.println("\t\tInvalid Amount");
                // sc.nextDouble();
                sc.next();
            }
        }

        return amount;
    }
    
}




