//A carpet is 5 m long and 4 m wide. 
//Find its price at the rate of $ 205 per square meter.
public class P28 {
    public static void main(String[] args) {
        //
        float areaOfCarpet, totCost, cost = 205, l = 5f, b = 4f;
        areaOfCarpet = l * b;
        System.out.println("Area: " + areaOfCarpet);

        totCost = cost * areaOfCarpet;
        System.out.println("Total cost: " + totCost);
    }
}
