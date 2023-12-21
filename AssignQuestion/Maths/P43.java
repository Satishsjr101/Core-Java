/*. Find the cost of polishing the base of a cone whose height is 4cm
and slant height 5 cm at the rate of 10 rs. Per sq. cm */
public class P43 {
    public static void main(String[] args) {
        double areaOfCone, pi = 22 / 7, h = 4, l = 5, r, totCost, rate = 10;
        double radius;
        // A=πr(r+(h2+r2)^2)
        // l= h2 +r2
        r = l * l - h * h;
        radius = Math.sqrt(r);
        double slant = Math.sqrt((h * h + radius * radius));

        areaOfCone = pi * radius * (radius + slant);
        System.out.println("Area of cone: " + areaOfCone);
        totCost = areaOfCone * 10;
        System.out.println("total Cost: " + totCost + " cm sq");
    }
}
