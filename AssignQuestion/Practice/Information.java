import java.util.Scanner;\lass Employee {
    private String name, adress;
    private int year;

    public Employee(String name, int year, String ad) {
        this.name = name;
        this.year = year;
        this.adress = ad;
    }

    public void printInformation() {
        System.out.println(name + "\t" + year + "\t" + adress);
    }
}

public class Information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee("Satish", 2000, "23A,IT park");
        Employee e2 = new Employee("Anil", 2001, "61A,Indore");
        Employee e3 = new Employee("Saloni", 2002, "B-Sector,Shajapur");
        e1.printInformation();
        e2.printInformation();
        e3.printInformation();

    }
}
