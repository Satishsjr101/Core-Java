/*16) Create a class Person with properties (name and age) with following features.
    Default age of person should be 18.
    A person object can be initialized with name and age.
    Method to display name and age of person
 */
class Person {
    private String name;
    private int age=18;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}
class TestM{
public static void main(String[] args) {
    Person p1=new Person("Satish", 20);
    p1.display();
}
}
