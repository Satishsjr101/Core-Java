class Addition {
    public int a, b;

    void add() {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.a = 20;
        obj.b = 10;
        obj.add();

    }
}