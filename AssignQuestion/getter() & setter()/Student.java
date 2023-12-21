import java.IllegalArgumentException;

class Student {
    private String name;
    private int rollNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        if (rollNum <= 0) {
            throw new IllegalArgumentException("Invalid Number");
        }
        this.rollNum = rollNum;
    }

    public void display() {
        System.out.print(this.name);
        System.out.print(this.rollNum);
    }
}

class Main {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("Abc");
        stu.setRollNum(-1);
    }
}
