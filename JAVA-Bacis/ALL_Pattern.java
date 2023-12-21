
public class ALL_Pattern {
    // public static void solid_rhombus(int n){

    //     for(int i=1; i<=n; i++){
    //         // spaces
    //         for(int j=1; j<=(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         // stars
    //         for(int j=1; j<=n; j++){
    //             System.out.print("*");
    //         }  
    //         System.out.println();
    //     }
    // }

    public static void Hollow_Rhombus(int n){
        for(int i=1; i<=n; i++){
            //  spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
  
            //Inner loop -  
            for(int j=1;j<=n;j++){
                //Cell-(i,j)
                if(i==1 || i==n|| j==1 || j==n){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        }
  public static void diamond(int n){
            //1st half 
            for(int i=1; i<=n; i++){
                // spaces 
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // Stars
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            // 2nd half
            for(int i=n; i>=1; i--){
                // spaces 
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // Stars
                for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
    public static void main(String args[]){
        // solid_rhombus(10);
        // Hollow_Rhombus(15);
        diamond(8);
        
    }
}



