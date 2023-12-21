public class Character_pattern {
    public static void main(String args[]){
        int n = 908070;
        int ch = 1;
        // outer loop
        for(int line=1; line<=n; line++){
            // inter loop
            for(int str=1; str<=line; str++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }       
}
