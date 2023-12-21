class GenericAddition<T extends Number> {
    
    private T num1;
    private T num2;

    public GenericAddition(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        // return num1.doubleValue() + num2.doubleValue();
        System.out.println(num1.intValue() + num2.intValue());
    }

    public static void main(String[] args) {
        GenericAddition<Integer> intAdd = new GenericAddition<>(5, 10);
        // System.out.println("Integer Addition: " + intAdd.add());

        // GenericAddition<Double> doubleAdd = new GenericAddition<>(5.5, 10.5);
        // System.out.println("Double Addition: " + doubleAdd.add());

        // GenericAddition<Float> floatAdd = new GenericAddition<>(5.5f, 10.5f);
        // System.out.println("Float Addition: " + floatAdd.add());
    }
}
