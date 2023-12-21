package info_bank;

import com.passwordactivationcode.Validation;
import connectivitycode.DataBaseConnectivity;
import customermethod.CustomerAccess;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import testadminoperation.AccountCreation;
/**
 *
 * @author Parth
 */
public class Bank {

    private static final String RESET = "\u001B[0m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";

    public static void main(String[] args) throws SQLException {
        Connection con = null;
        String accNo = null;
        String account = "";
        try{
         con = DataBaseConnectivity.getConnection();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("\n\n\t\t\t\t\t\t" + YELLOW + "" + dtf.format(now) + "" + RESET);
        boolean exit = false;
        while (!exit) {
            System.out.println("\n\n\t\t\t\t\t   WELCOME TO BANK APPLICATION\n\n");
            System.out.println(
                    "\t\033[0;30m\033[47m-----------------\t\t\t-------------------\t\t\t-----------------\033[0m");
            System.out.println(YELLOW
                    + "\t\033[0;30m\033[47m\u001B[34m 1) Admin Login  \t\t\t 2) Customer Login \t\t\t   3) Exit       \033[0m"
                    + RESET);
            System.out.println(
                    "\t\033[0;30m\033[47m-----------------\t\t\t-------------------\t\t\t-----------------\033[0m\n");

            System.out.println(
                    "\n\n\t..................................................................................................");
            System.out.print("\n\n\t\t\t\t\t\tEnter the Choice: ");
            int userChoice = input.nextInt();
            switch (userChoice) {
                case 1 -> {
                    Admin admin = new Admin();
                    
                    System.out.println("Enter Admin Username : ");
                    String username = input.next();
                    
                    System.out.println("Enter Admin Password : ");
                    String password = input.next();
                    
                    if (admin.login(con,username,password)) {
                        System.out.println(GREEN + "\t\t  YOU ARE SUCCESSFULLY LOGIN " + RESET);
                        boolean logout = false;
                        while (!logout) {
                            System.out.println("\n\n\t\t\t\t-----------------------------------------------------");
                            System.out.println(YELLOW + "\t\t\t\t\t\t WELCOME TO THE ADMIN PAGE" + RESET);
                            System.out.println("\t\t\t\t-----------------------------------------------------");

                            System.out.println(
                                    "\n\n\t\033[0;30m\033[47m-----------------\t-----------------\t-----------------\t---------------------\033[0m");
                            System.out.println(
                                    "\t\033[0;30m\033[47m\u001B[36m1)Create Customer\t 2)View Account  \t 3)Remove Account\t 4)View All Account  \033[0m"
                                    + RESET);
                            System.out.println(
                                    "\t\033[0;30m\033[47m-----------------\t-----------------\t-----------------\t---------------------\033[0m");
                            System.out.println(
                                    "\n\n\t\t\t\t\033[0;30m\033[47m-----------------\033[0m");
                            System.out
                                    .println(
                                            "\t\t\t\t\033[0;30m\033[47m\u001B[36m   5)LogOut      \033[0m"
                                            + RESET);
                            System.out.println("\t\t\t\t\033[0;30m\033[47m-----------------\033[0m");
                            System.out.println(
                                    "\n\n\t..................................................................................................\n");
                            System.out.print("\t\t\t\t\t\tEnter the choice: ");
                            int adminChoice = input.nextInt();
                            input.nextLine();
                            switch (adminChoice) {
                                case 1 ->
                                    AccountCreation.createAccount();
                                case 2 ->
                                    admin.viewParticularAccount();
                                case 3 ->
                                    admin.removeBlockAccount();
                                case 4 ->
                                    admin.viewAllAccount();
                                case 5 -> {
                                    System.out.println(RED + "\t\t  Admin logged Out" + RESET);
                                    logout = true;
                                }
                                default ->
                                    System.out.println(RED + "\t\t  Invalid option." + RESET);
                            }
                        }
                    } else {
                        System.out.println(RED + "\t\t\tAdmin login failed." + RESET);
                    }
                }
                case 2 -> {
                    CustomerAccess customer = new CustomerAccess();
                 //   System.out.print("\t\t Enter Account No : ");
                    account = Validation.accNo();
                    System.out.print("\t\t Enter Password : ");
                    String password = input.next();
                    boolean flag = false;
                    if (customer.login(con,account,password)) {
                        flag = true;
                        System.out.println(GREEN + "\n\n   \t   \t\t\t\t \tcustomer logged-in Successfully" + RESET);
                        boolean logout = false;
                        while (!logout) {
                            System.out.println(YELLOW + "\n\t\t\t\t\t\t WELCOME TO THE CUSTOMER PAGE" + RESET);
                            System.out.println("\n\t===========================================================");
                            System.out.println("\t\t" + YELLOW + "Please choose an option:" + RESET);
                            System.out.println("\t\t 1. View account details");
                            System.out.println("\t\t 2. Apply for loan");
                            System.out.println("\t\t 3. View loan statement");
                            System.out.println("\t\t 4. Transfer money");
                            System.out.println("\t\t 5. View transaction history");
                            System.out.println("\t\t 6. Update account details");
                            System.out.println("\t\t 7. Logout");
                            System.out.println("\t===========================================================");
                            System.out.print("\t\t Perform a task to input from 1 to 7 : ");
                            int customerChoice = input.nextInt();
                            input.nextLine();

                            switch (customerChoice) {
                                                case 1 ->{
                                                    customer.viewAccount(con,password);
                                                }
                                                // customer.updateAccount();
                                                case 2 ->
                                                {
                                                    customer.applyLoan(account);
                                                }
                                               case 3 -> {
                                                   customer.loanStatement(con, password, account);
                                               }
                                                case 4 -> 
                                                {
                                                    customer.transferMoney(con,password,account);
                                                }
                                                
                                                case 5 -> {
                                                  
                                                    customer.transactionHistory(con,account);
                                                }
                                                case 6 -> customer.updateDetails(con);
                                case 7 -> {
                                    System.out.println("Customer logged out.");
                                    logout = true;
                                }
                                default ->
                                    System.out.println("\t\t\tInvalid option.");
                            }
                        }
                    } else {
                        System.out.println("\t\t\tCustomer login failed.");
                    }
                }
                case 3 -> {
                    System.out.println("\t\tThank you for using the Banking Application.");
                    exit = true;
                }
                default ->
                    System.out.println("\t\tInvalid option.");
            }
        }
    }
}
