class New {
    public static void main(String[] args) {
        TestMain t = new TestMain();
        t.m1();
    }
}

class TestMain {
    public void m1() {
        System.out.println("Sigle argument");
    }

    public void m1(int... x) {
        System.out.println("Var-arg call");
    }

}
