package Set;

import java.util.TreeSet;

class Student implements Comparable<Student> {
    private String name;
    private int age, id;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String toString() {
        return id + "\t" + name + "\t\t" + age;
    }

    public int compareTo(Student o) {
        int x = this.name.compareTo(o.name);
        if (x == 0)
            return 1;
        return x;
    }
}

public class Comparable1 {
    public static void main(String[] args) {
        // By Name
        TreeSet<Student> ts = new TreeSet<Student>();
        ts.add(new Student(1, "Satish", 20));
        ts.add(new Student(2, "Shyam", 18));
        ts.add(new Student(3, "Sandeep", 99));
        ts.add(new Student(4, "MANJEET", 71));
        ts.add(new Student(5, "Prateek", 97));
        ts.add(new Student(6, "Yogesh", 21));
        for (Student std : ts) {
            System.out.println(std);
        }
    }
}
