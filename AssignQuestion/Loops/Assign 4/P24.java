public class P24 {
    public static void main(String[] args) {
         int r;
        double t,s = 0 ;
        for(int i=1;i<=5;i++){
            int y=1;
             int x = 2;
             r=1;
            for(int j=1;j<=i;j++){
              r = r*x;
            //   System.out.println(r);
            }
            System.out.println(r+"rr");
            t = y/r;
            System.out.println(t);
            s = s+t;
        }
    }
}
