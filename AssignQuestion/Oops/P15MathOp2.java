/*  15) Create a class MathOperation containing method ‘multiply’ to calculate 
    multiplication of following arguments.
    two integers
    three float
    all elements of array
    one double and one integer
 */
class Operations {
    public double r = 1;

    public void multiply(int x, int y) {
        r = x * y;
        System.out.println("Int-Int version " + r);
    }

    public void multiply(int... x) {
        for (int i = 0; i < x.length; i++) {
            r = r * x[i];
        }
        System.out.println("Int... X version " + r);
    }

    public void multiply(float x, float y, float z) {
        r = x * y * z;
        System.out.println("F-F-F Version " + r);
    }

    public void multiply(double x, int y) {
        r = x * y;
        System.out.println("Double-Int version " + r);
    }

}

class P15MathOp2 {
    public static void main(String[] args) {
        Operations obj = new Operations();
        obj.multiply(2.12f, 5.44f, 4.21f);
    }

}
