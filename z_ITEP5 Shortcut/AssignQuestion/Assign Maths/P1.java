/*The perimeter of a rectangle is 230 cm. 
If the length of the rectangle is 70 cm, find its breadth and area.
 */
public class P1 {
    public static void main(String[] args) {

        float l = 70f, periOfRec = 230, b, area;
        b = (periOfRec / 2) - l; // periOfRec=2*(l+b);
        area = b * l;
        System.out.println("Breadth : " + b);
        System.out.println("Area of rectangle= " + area + " cm.");
    }
}
