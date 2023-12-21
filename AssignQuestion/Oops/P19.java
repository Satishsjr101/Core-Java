/*19) Make list of Students having name, roll no., age, score. 
Write a program to accept 10 students record and arrange the Students 
based on the score group [0-50], [50-65],[65-80],[80-100]. */
class StudentsRecord {
    private String name;
    private int rollNo, age;
    private double score;

    public StudentsRecord(String name, int rollNo, int age, double score) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }

    public void display(StudentsRecord... r) {
        for (int i = 0; i < r.length; i++) {
            if (r[i].score <= 50) {
                System.out.println("Name: " + r[i].name + "\t RollNO: " + r[i].rollNo + "\t Age: " + r[i].age
                                + "\t Score: "
                                + r[i].score);
            }
            if (r[i].score > 50 && r[i].score <= 65) {
                System.out
                        .println("Name: " + r[i].name + "\t RollNO: " + r[i].rollNo + "\t Age: " + r[i].age
                                + "\t Score: "
                                + r[i].score);

            }
            if (r[i].score > 65 && r[i].score <= 80) {
                System.out
                        .println("Name: " + r[i].name + "\t RollNO: " + r[i].rollNo + "\t Age: " + r[i].age
                                + "\t Score: "
                                + r[i].score);

            } else if (r[i].score > 80 && r[i].score <= 100) {
                System.out
                        .println("Name: " + r[i].name + "\t RollNO: " + r[i].rollNo + "\t Age: " + r[i].age
                                + "\t Score: "
                                + r[i].score);
            }
        }
    }
}

class Main19 {
    public static void main(String[] args) {
        StudentsRecord r1 = new StudentsRecord("Anil", 1, 18, 100);
        StudentsRecord r2 = new StudentsRecord("Babita", 2, 19, 90);
        StudentsRecord r3 = new StudentsRecord("Craty", 3, 17, 80);
        StudentsRecord r4 = new StudentsRecord("Dev", 4, 20, 60);
        StudentsRecord r5 = new StudentsRecord("Elvish", 5, 21, 74);
        StudentsRecord r6 = new StudentsRecord("Faran", 6, 18, 81);
        StudentsRecord r7 = new StudentsRecord("Govind", 7, 22, 56);
        StudentsRecord r8 = new StudentsRecord("Hitesh", 8, 23, 49);
        StudentsRecord r9 = new StudentsRecord("Imli", 9, 24, 30);
        StudentsRecord r10 = new StudentsRecord("Jiya", 10, 16, 20);
        r1.display(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);

    }
}
