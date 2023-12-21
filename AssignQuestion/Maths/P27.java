//Find the cost of tiling a dining room 20 m long and
// 15 m wide at the rate of $ 5 per square m.
public class P27 {
    public static void main(String[] args) {

        float areaOfRoom, totCost, cost = 5, l = 20f, b = 15f;
        areaOfRoom = l * b;
        System.out.println("Area: " + areaOfRoom);

        totCost = cost * areaOfRoom;
        System.out.println("cost of tiling a dining room: $ " + totCost + " m sq");
    }
}
