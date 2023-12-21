/* The area of a rectangle is 96 cm². 
If the breadth of the rectangle is 8 cm, find its length and perimeter.  */
public class P2 {
    public static void main(String[] args) {

        float l, periOfRec, b = 8f, area = 96f;
        l = area / b; // area = b * l;
        periOfRec = 2 * (l + b);
        System.out.println("Length: " + l);
        System.out.println("Perimeter = " + periOfRec + " cm.");
    }
}
