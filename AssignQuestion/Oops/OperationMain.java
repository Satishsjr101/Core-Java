/*14) Create a class MathOperation with two data member X and Y to store the operand and 
    third data member R to store result of operation.Create method members
    init - to input X and Y from user
    add - to add X and Y and store in R
    multiply - to multiply X and Y and store in R
    power - to calculate X Y and store in R
    display- to display Result R
 */
import java.lang.Math.*;
class MathOperation {
    public float x,y;
    double r;
    public void init(float x,float y){
        this.x=x;
        this.y=y;
    }
    public void add(){
        r=x+y;
    }
    public void multiply(){
        r=x*y;
    }
    public void power(){
        r=Math.pow(x,y);
        
    }public void display(){
        System.out.println("Result: "+r);
    }
}
public class OperationMain{
    public static void main(String[] args) {
        MathOperation obj=new MathOperation();
        obj.init(4,2);
        // obj.add();
        // obj.multiply();
        obj.power();
        obj.display();
    }
}
