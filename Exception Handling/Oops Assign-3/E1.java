import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public void show() {
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
    }
}

class MainT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person obj;
        try {
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            Person obj = new Person(name, age);
        } catch (Exception e) {
            System.out.println("Invalid");

        } finally {
            obj.show();
            sc.close();
        }
    }
}