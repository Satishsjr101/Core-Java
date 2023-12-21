//Pojo Program --> Plain Old Java Objecgt
class Addition {
    private int a, b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public Addition() {
        a = b = 100;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void getA(int a) {
        this.a = a;
    }

    public void gettB(int b) {
        this.b = b;
    }

    public void add() {
        System.out.println("Addition: " + (a + b));
    }
}

class TestMain {
    public static void main(String[] args) {
        Addition obj = new Addition(10, 20);
        obj.setA(40);
        obj.add();
    }
}