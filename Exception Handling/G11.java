class G121 {
    public static void main(String[] args) {
        int arr[] = { 7, 6, 4, 5, 5, 1 };
        int price = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (price > arr[i])
                price = arr[i];
            if (arr[i] - price > maxProfit)
                maxProfit = arr[i] - price;
        }
        System.out.println(maxProfit + " m");
    }
}