package Set;

import java.util.TreeSet;

class Customer implements Comparable<Customer> {
    private String name;
    private int age, id;

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Customer() {
    }

    public String toString() {
        return id + "\t" + name + "\t" + age + "\t";
    }

    public int compareTo(Customer o) {
        // return this.id - o.id;
        // int x = this.name.compareTo(o.name);
        int x = this.age - o.age;
        if (x == 0)
            return 1;
        return x;

    }
}

public class Comparable3 {
    public static void main(String[] args) {
        TreeSet<Customer> ts = new TreeSet<Customer>();
        ts.add(new Customer(1, "Satish", 22));
        ts.add(new Customer(2, "Shubham", 21));
        ts.add(new Customer(4, "Ghanshyam", 18));
        ts.add(new Customer(7, "Rohit", 21));
        ts.add(new Customer(3, "Sandeep", 23));
        ts.add(new Customer(6, "Yogesh", 25));
        ts.add(new Customer(5, "Prateek", 17));
        ts.add(new Customer(8, "Prateek", 17));
        for (Customer teacher : ts) {
            System.out.println(teacher);
        }
    }
}
