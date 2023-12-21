
/*26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
	Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade F */s
import java.util.Scanner;

public class P26 {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks Of Physic:");
        float phy = sc.nextInt();
        System.out.println("Enter Marks Of Chemistry:");
        float ch = sc.nextInt();
        System.out.println("Enter Marks Of maths:");
        float m = sc.nextInt();
        System.out.println("Enter Marks Of Computer:");
        float com = sc.nextInt();
        System.out.println("Enter Marks Of Biology:");
        float bio = sc.nextInt();

        float per = ((ch + phy + com + bio + m) / 5.0f);

        System.out.println("-------------Result-----------:- ");
        System.out.println("percentage :" + per);

        if (per < 40f) {
            System.out.println("F Grade");
        } else if ((per >= 40f)) {
            System.out.println("E Grade");
        } else if ((per >= 60f)) {
            System.out.println("D Grade");
        } else if ((per >= 70f)) {
            System.out.println("C Grade");
        } else if ((per >= 80f)) {
            System.out.println("B Grade");
        } else if ((per >= 90f)) {
            System.out.println("A Grade");
        } else {
            System.out.println("Failed..");
        }
    }
}
