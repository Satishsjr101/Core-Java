/*  Q.12 a) Write a statement that declares a string array initialized with the following strings:
"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
b) Write a loop that displays the contents of each element in the array that you declared.
  */
public class A12 {
    public static void main(String[] args) {
        String a[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print("{ " + a[i] + ", ");
            } else if (i > 0 && i < a.length - 1) {
                System.out.print(a[i] + ", ");
            } else if (i < a.length) {
                System.out.print(a[i] + " }");
            }

        }
    }
}
