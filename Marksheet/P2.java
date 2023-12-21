interface I {
    void collageName(String collageName);
}

class Teacher implements I {
    private String name, quali, collageName;

    public Teacher(String name, String quali) {
        this.name = name;
        this.quali = quali;
    }

    public void collageName(String collageName) {
        this.collageName = collageName;
    }

    public void show() {
        System.out.println(
                "Collage Name: " + collageName + "\nName of Teacher: " + name + "\nQualification of Teacher: " + quali);
    }
}

class Department extends Teacher {
    private String deptno, deptName;

    public Department(String name, String quali, String deptno, String deptName) {
        super(deptName, quali);
        this.deptno = deptno;
        this.deptName = deptName;
    }

    public void show() {
        super.show();
        System.out.println("Department Number: " + deptno + "\nDepartment Name: " + deptName);
    }
}

class P2 {
    public static void main(String[] args) {
        Department obj = new Department("Satish", "BCA Pass", "BCA100", "Bachelor of Computer");
        obj.collageName("MRSC Collage");
        obj.show();
    }
}