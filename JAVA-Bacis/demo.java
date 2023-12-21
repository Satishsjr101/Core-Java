public class demo{
    
    public static void half_pyramid_With_NO(int n){
        
    }
    public static void half_pyramid(int  n){
        for(int i=1; i<=n; i++)
        {
            
            for(int j=1; j<=n-i; j++){
            System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        
            
            System.out.println();
        }
    }

    public static void Hollow_Rec(int totRows,int totCols){
        for(int i=1; i<=totRows; i++){
            for(int j=1;j<=totCols; j++){
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }
                  else{
                System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static int get_smallest(int n[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<n.length; i++){
            if(smallest > n[i]){
                smallest=n[i];

            }
         
        }return smallest;
    }
    public static void Reverse(int n[]){
        int f = 0;
        int l = n.length-1;
        while(f<l){
                int temp = n[f];
                n[f] = n[l];
                n[l] = temp;

                f++;
                l--;
        }
            
}
    public static void printPairs(int n[]){
        for(int i=0; i<n.length; i++){
            int curr = n[i];
            for(int j=i+1;j<n.length;j++){
                System.out.print("(" + n[i] + "," + n[j] + ")");

            }System.out.println();
        }        
    }
    
    public static void main(String args[]){
    //    Hollow_Rec(1011, 1227);  
        // half_pyramid(7123);
        // int n[] = {2,4,6,8,15,31};
        // int lar = get_smallest(n);
        // System.out.println(lar);
        // int midd = (n.length)/2; 
        // System.out.println(midd);
        // int n[]= {2,4,6,8,10};
        // Reverse(n);
        // for(int i=0; i<n.length; i++){
        //     System.out.print(n[i]+" ");
        // }
        // printPairs(n);
        int n[]={2,4,6,8,10};
        // printPairs(n);
        

    }
}
