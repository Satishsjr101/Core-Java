/* Q.3 WAP using parameterized constructor with two parameters id and name. While creating 
    the objects obj1 and obj2
    passed two arguments so that this constructor gets invoked after creation of obj1 and obj2   */
class Student {
    Student(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student obj1 = new Student(1, "Satish");
        Student obj2 = new Student(2, "Anil");
    }
}