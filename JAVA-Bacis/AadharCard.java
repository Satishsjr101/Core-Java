import java.io.PrintStream;
import java.util.Scanner;

public class AadharCard {
    public static void main(String[] args) {
        String name, dob, gender, Aadhar;
        Scanner sc = new Scanner(System.in);
        System.out.println("====================Aadhar Card Maker ========================");
        System.out.println("Enter a Name:");
        name = sc.nextLine();
        System.out.println("Enter a Date Of Birth(DD/MM/YYYY):");
        dob = sc.nextLine();
        System.out.println("Enter a Gender(Male/Female):");
        gender = sc.nextLine();
        System.out.println("Enter a Aadhar  Number(XXXX XXXX XXXX):");
        Aadhar = sc.nextLine();

        System.out.println("\n");
        System.out.println("____________________________________________________________");
        System.out.println("|				   		  	     |");
        System.out.println("| \t\t\tGovernment OF India           	     |");
        System.out.println("|				    	  		     |");
        System.out.println("|  __________	Name: " + name + "		     |");
        System.out.println("| |	     |	DOB: " + dob + " |");
        System.out.println("| |	     |	Gender: " + gender + "		     	       	     |");
        System.out.println("| |	     |	Aadhar No: " + Aadhar + "     	      	     |");
        System.out.println("| |__________|  					     |");
        System.out.println("|____________________________________________________________|");

        System.out.println();
        System.out.println("____________________________________________________________");
        System.out.println("|				   		  	     |");
        System.out.println("| \t\t\tGovernment OF India           	     |");
        System.out.println("|				    	  		     |");
        System.out.println("|	Addres: S/O Ram Vishwakarma,			     |");
        System.out.println("|  	Ram Mandhir Seri, Gram Jaloda, Post Panwadi 	     |");
        System.out.println("|  	District: Shajapur 		     	       	     |");
        System.out.println("| 	State: Madhya Pradesh PIN:465001		     |");
        System.out.println("|____________________________________________________________|");

    }

}
