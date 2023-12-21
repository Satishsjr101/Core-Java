public class power {
   public static int  square(int i,int j){
    int r = 1;
    for (int j2 = 1; j2 <= j; j2++) {
       r = r*i;
    }
    return r;


   }  


    public static void main(String[] args) {
        int number = 5;
        int power = 2;

           int r = square( number, power);
            System.out.println(r);
    }
}
