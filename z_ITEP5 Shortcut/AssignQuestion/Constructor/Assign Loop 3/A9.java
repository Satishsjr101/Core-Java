/*Q 9 Write a program by creating an 'Employee' class having the following methods and print 
the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as 
parameter
2 - 'AddSal()' which adds 10000 to salary of the employee if it is less than 50000.
3 - 'AddWork()' which adds 5000 to salary of employee if the number of hours of work per day 
is more than 6 hours. */
class Employee {
    float slry, nOfHours;

    void getInfo(float slry, float nOfHours) {
        this.slry = slry;
        this.nOfHours = nOfHours;
    }

    void AddSal(int slry) {
        if (slry < 50000)
            slry = slry + 10000;
        System.out.println("Salary: " + slry);
    }

    void AddWork(float nOfHours) {
        if (nOfHours > 6) {
            slry = slry + 5000;
        }
        System.out.println("Salary(nOfhours): " + slry);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.getInfo(49000, 8);
        emp.AddSal(50000);
        emp.AddWork(9);

    }
}
