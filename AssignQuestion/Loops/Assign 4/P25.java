public class P25 {
    public static void main(String[] args) {
        
        double t=0;
        double r=0;
        for(int i=1;i<=5;i++){
           double x =1;
           r = x/i;
           System.out.println("r "+r);
           t =  t+r;
        }
        System.out.println(t);
    }
}
