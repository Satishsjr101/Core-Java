// 4)How to update and retrive  the value of a particular property of an object 
// from anothor class(Let suppose the property is private) ?
class GetterSetter {
    private int a, b;

    public void getA(int a) {
        this.a = a;
    }

    public void getB(int b) {
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void display() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }

    public void add() {
        System.out.println("Add: " + (a + b));
    }

}

class TestMain {
    public static void main(String[] args) {
        GetterSetter obj = new GetterSetter();
        obj.getA(10);
        obj.getB(20);
        obj.setA(90);
        obj.setB(10);
        obj.display();
        obj.add();
    }
}