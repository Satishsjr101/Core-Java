package testadminoperation;

import com.passwordactivationcode.javaEmailSender;
import info_bank.Admin;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
import info_bank.Customer;
import com.passwordactivationcode.Validation;
import static com.passwordactivationcode.Validation.isValidGmailAddress;
/**
 *
 * @author Parth
 */
public class AccountCreation {

    private static final String RESET = "\u001B[0m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";
    
    public static Connection con = null;
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public static LocalDateTime now = LocalDateTime.now();

    public static void createAccount() {
        Scanner input = new Scanner(System.in);
        javaEmailSender obj = new javaEmailSender();
        Random random = new Random();
        boolean check = true;
        while (check) {
            System.out.print("\n\n\t\tEnter initial balance amount:");
            double balance = input.nextDouble();
            if (balance < 3000) {
                System.out.println(RED + "\t\tIncorrect amount! Please credit above the 3000");
                System.out.println("\t\tRe-enter the again amount" + RESET);
                continue;
            }

            boolean forName = true;
            String name = null;
            char ch = '\u0000';
            input.nextLine();
            while (forName) {
                System.out.print("\t\t Enter name:");
                name = input.nextLine();
                for (int i = 0; i < name.length(); i++) {
                    ch = name.charAt(i);
                }
                if (!Character.isLetter(ch)) {
                    System.out.println(RED + "\t\tPlease enter the valid name " + RESET);
                    continue;
                }
                forName = false;
            }
//            System.out.print("\t\t Enter your age : ");
//            int age = input.nextInt();
            boolean forFname = true;
            String fName = null;
            char ch1 = '\u0000';
            while (forFname) {
                System.out.print("\t\t Enter the father's name : ");
                fName = input.nextLine();
                for (int i = 0; i < fName.length(); i++) {
                    ch1 = fName.charAt(i);
                }
                if (!Character.isLetter(ch1)) {
                    System.out.println(RED + "\t\tPlease enter the valid name " + RESET);
                    continue;
                }
                forFname = false;
            }
            String PAN = null;
            boolean flag = true;
            while (flag) {
                System.out.print("\t\t Enter your PAN No. ");
                PAN = input.next();
                if (!Validation.validatePAN(PAN)) {
                    System.out.print("\t\t You have entered incorrec PAN re-enter again \n");
                    continue;
                }
                flag = false;
            }
            String aadhar = Validation.aadhar();
            String DOB = null;
            boolean checkDOB = true;
            while (checkDOB) {
                System.out.print("\t\t Enter the Date of Birth : ");
                DOB = input.next();

                if (Validation.isValidDOB(DOB)) {
                    // System.out.println("\t\t\t Validate DOB");
                } else {
                    System.out.println("\t\t\tInvalid DOB!");
                    System.out.println("\t\t\t Re-enter Again ");
                    continue;
                }
                checkDOB = false;
            }
            System.out.print("\t\t Enter address:");
            input.nextLine();
            String address = input.nextLine();

            String mobile = Validation.Contact(input);
            long accountNumber = 10000000000l /*+ random.nextLong(90000000000L)*/;
            System.out.println("\t\t Account Number has been generated : " + accountNumber);
            String pass  = null;
            String email = null;
            boolean checkmail = true;
            while (checkmail) {
                System.out.print("\t\t Enter your mail : ");
                 email = input.next();
                if (!isValidGmailAddress(email)) {
                    System.out.println("\t\t invalid mail re-enter again ");
                    continue;
                } else {
                     obj.setEmailAddressTo(email);
                      pass = obj.password();
                }
                checkmail = false;
            }
            boolean isBlock = false;
            String date = dtf.format(now);
          //  System.out.println("\t\t Account created date & time : " + date);
            // write code to send the password on mail
            Customer cus = new Customer(accountNumber, name, fName, address, balance, DOB, PAN, aadhar, email, mobile, pass, date, isBlock);
            if (Admin.createAccount(cus) != -1) {
                System.out.println("\t\tAccount Created Successfully ");
            } else {
                System.out.println("\t\tFailed");
            }
            check = false;
        }
    }

}
