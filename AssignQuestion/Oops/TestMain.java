/*13) Create a class to calculate Area of circle with one data member to store the radius and 
      another to store area value. Create method members
      init - to input radius from user
      calc - to calculate area
      display- to display area
 */
class AreaOfCircle{ 
    public float radius;
    public float area;
    public void init(float radius){
        this.radius=radius;
    }
    public void calc(){
        area=3.14f*radius*radius;
    }
    public void display(){
        System.out.println("Area of circle: "+area);
    }
}
public class TestMain{
    public static void main(String[] args) {
        AreaOfCircle obj=new AreaOfCircle();
        obj.init(4);
        obj.calc();
        obj.display();
        System.out.println(".........");
    } 
}
