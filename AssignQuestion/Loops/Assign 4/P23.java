public class P23 {
    public static void main(String[] args) {
        int r,rev ;
        for(int i=101;i<=199;i++){
         int temp =i;   rev=0;
            while (temp>0) {
               r = temp%10;
               rev = rev+r*r*r; 
               temp = temp/10;

            }
            if (i==rev) {
                System.out.println(rev);
            }
        }
    }
}
