package Set;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    private String name, employeePost;
    private int age, id;

    public Employee(int id, String name, int age, String employeePost) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.employeePost = employeePost;
    }

    public Employee() {
    }

    public String toString() {
        return id + "\t" + name + "\t" + age + "\t" + employeePost;
    }

    public int compareTo(Employee o) {
        int x = this.id - o.id;
        if (x == 0)
            return 1;
        return x;

    }
}

public class Comparable2 {
    public static void main(String[] args) {
        TreeSet<Employee> ts = new TreeSet<Employee>();
        ts.add(new Employee(1, "Satish", 22, "Front-end Developer"));
        ts.add(new Employee(2, "Shubham", 21, "Back-end Developer"));
        ts.add(new Employee(4, "Ghanshyam", 18, "Assistant Software Developer"));
        ts.add(new Employee(7, "Rohit", 21, "Software Developer"));
        ts.add(new Employee(1, "Ritesh", 23, "HR-Manager"));
        ts.add(new Employee(6, "Yogesh", 25, "HOD"));
        ts.add(new Employee(5, "Ritesh", 17, "Project Manager"));
        ts.add(new Employee(1, "Prateek", 17, "Developer"));
        for (Employee emp : ts) {
            System.out.println(emp);
        }
    }
}
