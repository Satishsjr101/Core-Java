import java.util.*;

import java.util.Arrays;

public class ArrayClassMarks {
    public static int Linear_Search(int n[], int key){
        for(int i=0; i<n.length; i++){
            if(n[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int get_Largest(int n[]){
        int largest = Integer.MAX_VALUE;
        for(int i=0;i<n.length;i++){
            if(largest<n[i]){
                largest = n[i];
            }
        
        }return largest;
    }
    public static int Binary_Search(int n[],int key){
        int start = 0, end = n.length -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(n[mid]==key){
                return mid;
            }
            if(n[mid]<key){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }return -1;
    }
    public static void reverse(int n[]){
        int first = 0, last  =  n.length-1;
        while(first<last){
            int temp = n[last];
             n[last] = n[first];
            n[first] = temp;

            
            first++;
            last--;   
        }

    }
    public static void printPairs(int n[]){
        for(int i=0; i<n.length; i++){
            int current = n[i];
            for(int j = i+1;j<n.length;j++){
                System.out.print( "(" + current + "," + n[j]+")");
            }
            System.out.println();
        }

    }
    public static void SubArrs(int n[]){
        for(int i=0; i<n.length;i++){
            int start = i;
            for(int j=1;j<n.length;j++){
                int end = j;
                for(int k= start;k<=end;k++){
                    System.out.print(n[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void Max_sum_SubArrs(int n[]){
        for(int i=0; i<n.length;i++){
            int currSum=0;
            int maxSum=Integer.MIN_VALUE;
            int start = i;
            for(int j=1;j<n.length;j++){
                int end = j;
                currSum=0;
                for(int k= start;k<=end;k++){
                    // SunArrays ka sum calculate
                    currSum+=n[k]; 
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        
        System.out.println("Maximum sum:" + maxSum);}
    }
    public static int trapped_RainWater(int heigth[]){
        int n = heigth.length;
        // Calculate left max boundary - array
        int leftMax[]=new int[n];
        leftMax[0]=heigth[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(heigth[i], leftMax[i-1]);
        }
        // Calculate rigth max boundary - array
        int rigthMax[]=new int[n];
        rigthMax[n-1]=heigth[n-1];
        for(int i=n-2;i>=0;i--){
            rigthMax[i]=Math.max(heigth[i], leftMax[i+1]);
        }
        int trappedWater=0;
        // loop
        for(int i=1;i<n;i++){
            // water level
            int waterLevel=Math.min(leftMax[i], rigthMax[i]);
            // trapped water
            trappedWater+=waterLevel-heigth[i];
        }      
    return trappedWater;
    }

    public static int buy_n_sell_Stocks(int p[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        
        for(int i=0;i<p.length;i++){
            if(buyPrice<p[i]){
            int profit=p[i]-buyPrice;
            maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyPrice=p[i];
            }
        }
        return maxProfit;
    }
    public static void BubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
            int arr[]={5,4,1,2,3};
            // Arrays.sort(ar);
            // Arrays.sort(ar,0,3);
            BubbleSort(arr);
            printArr(arr);
            // int n[] = {1,2,3,4,5};
            // int key = 45;
            // int index = Linear_Search(n, key);
            // if(index == -1){
            //     System.out.println("Key not exist");
            // }
            // else{
            //     System.out.println("Key  at index "+index);
            // }
        //    System.out.println((Binary_Search(n, key)==-1)?false: true);
        //    System.out.println(key+" on index:"+Binary_Search(n, key));
       
    //     reverse(n);
    //     for(int i=0;i<n.length;i++){
    //         System.out.print(n[i]+" ");
    //     }
    //    System.out.println();
    // printPairs(n);
    // int n[] = {1,-2,6,-1,3};
    // Max_sum_SubArrs(n);
    
    // int p[] = {7,1,5,3,6,4};
    // System.out.println(buy_n_sell_Stocks(p));
    
    }
}
