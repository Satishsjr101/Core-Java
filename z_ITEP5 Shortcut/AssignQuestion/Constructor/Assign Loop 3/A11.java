/*Q.11 Create class Product (pid, price, quantity) with parameterized constructor. Create a main 
function in different class (say XYZ) and perform following task: 
    a. Accept five product information from user and store in an array  
    b. Find Pid of product with highest price.  
    c. Create method (with array of product’s object as argument) in XYZ class to calculate and return 
    total amount spent on all products. (amount spent on single product=price of product * quantity of 
    product).    */

import java.util.Scanner;

class Product {
    Product(int pid, float price, float quantity) {

    }

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter array: ");
            a[i] = sc.nextInt();
        }
    }
}
