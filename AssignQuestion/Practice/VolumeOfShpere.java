import java.util.Scanner;

public class VolumeOfShpere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        float r = sc.nextFloat();
        
        double VolumeOfShpere=(4/3)*(22/7)*r*r*r;
        System.out.println("Volume: "+VolumeOfShpere);
    }
}
