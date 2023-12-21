/*17) Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
    Only parameterized constructor;
    totalSalary always represent total of all the salaries of all employees created.
    empNo should be auto incremented.
    display total employees and totalSalary using class method.
*/
class Employee1 {
    private int empNo = 1;
    private double salary;
    private double totalSalary;

    public Employee1(double salary) {
        this.salary = salary;
        this.totalSalary = salary;
    }

    public void totalSlry(Employee1... e) {
        for (int i = 0; i < e.length; i++) {
            totalSalary += e[i].salary;
            empNo++;
        }
    }

    public void display() {
        System.out.println("Total Employees: " + empNo);
        System.out.println("Total Salary of all employees: " + totalSalary);
    }

}

class Main {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1(10000);
        Employee1 e2 = new Employee1(20000);
        Employee1 e3 = new Employee1(30000);
        Employee1 e4 = new Employee1(40000);
        Employee1 e5 = new Employee1(50000);
        e1.totalSlry(e2, e3, e4, e5);
        e1.display();

    }
}
