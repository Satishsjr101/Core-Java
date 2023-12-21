import java.util.*;
public class Hollow_Pattern {
    public static void hollow_Rectangle(int totRows, int totCols){
         
       

    }
    public static void main(String argd[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbwe of Rows:");
        int totRows = sc.nextInt();
        System.out.println("Enter numbwe of Columns:");
        int totCols = sc.nextInt();
        hollow_Rectangle(totCols,totCols);

    }
}
 //Outter loop
        for(int i=1; i<=totRows; i++){
            //Inner loop -  
            for(int j=1;j<=totCols;j++){
                //Cell-(i,j)
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }