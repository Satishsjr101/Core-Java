import java.util.*;
public class _2d_Matrix {


    // public static void main(String args[]){
    //     int matrix[][] = new int[3][3];
    //     int n=matrix.length,m=matrix[0].length;
    //     System.out.println("Enter a number:");
    //     Scanner sc = new Scanner(System.in);
    //     for(int i=0; i<n; i++){
    //         for(int j = 0;j<m;j++){
    //             matrix[i][j] = sc.nextInt();
    //         }       
    //     }
    //     // Outop
    //     for(int i=0;i<n;i++){
    //         for(int j = 0;j<m;j++){
    //             System.out.print( matrix[i][j] + " ");
    //         }
    //         System.out.println();     
    //     }  
    // }
    public static void printSpiraalMatrix(int matrix[][]){
        int sr=0;
        int sc=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;

        while(sr<=er && sc<=ec){
            // top
            for(int j=sc;j<=ec;j++){
                System.out.print(matrix[sr][j]+" ");
            }
              // right
              for(int i=sr=1;i<=er;i++){
                System.out.print(matrix[i][ec]+" ");
            }
              // bottom
              for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }                
                System.out.print(matrix[er][j]+" ");
            }
              // left
              for(int i=er-1;i>=sr;i--){
                if(sc==ec){
                    break;
                }                
                System.out.print(matrix[i][sc]+" ");
            }
            sc++;
            sr++;
            ec--;
            er--;
        }
        System.out.println();
}
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},
                        {9,10,11,12},{13,14,15,16},
                        {17,18,19,20},{21,22,23,24},
                        {25,26,27,28},{29,30,31,32},
                        {33,34,35,36},{37,38,39,40} };
        printSpiraalMatrix(matrix);
    }
}


