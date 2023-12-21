public class inverted_pyramid{
public static void inverted_pyramid(int n){
    //outer
    for(int i=1; i<=n; i++){
        //Space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //Stars
        for(int j=1; j<=n-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }   
}
public static void main(String argd[]){
    inverted_pyramid(4);
}

}