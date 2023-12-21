import java.util.*;

public class Strings {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String name = sc.nextLine();
        System.out.print(name.charAt(0));
        
    }
}

class Student{
    String name;
    int RollNo;

    Student(String name){
        this.name = name;
    }
}