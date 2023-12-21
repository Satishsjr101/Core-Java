/*5) Create an Object having two properties and four behaviours
  (add,substract,multiply,divide) to perform desired operation.
  object must have setter and getter and keep all properties private.
 */
public class Calculator {
    private float a, b;

    public Calculator(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void substract() {
        System.out.println("Substration: " + (a - b));
    }

    public void multiply() {
        System.out.println("Multiply: " + (a * b));
    }

    public void divide() {
        System.out.println("Divide: " + (a / b));
    }

    public void add() {
        System.out.println("Addition: " + (a + b));
    }
}

class TestMain {
    public static void main(String[] args) {
        Calculator obj = new Calculator(50, 20);
        obj.setA(60);
        obj.setB(80);
        obj.add();
    }

}
