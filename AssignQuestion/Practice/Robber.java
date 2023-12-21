class Robber {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 3, 7, 9, 6, 8, 0, 4 };
        int Osum = 0, Esum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                Osum += arr[i];
            else if (i % 2 == 1)
                Esum = Esum + arr[i];
        }
        if (Osum > Esum)
            System.out.println("Max amount : " + Osum);
        else
            System.out.println("Max amount : " + Esum);
    }
}