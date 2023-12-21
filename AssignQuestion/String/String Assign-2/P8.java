/*8. Write a Java program to test if a given string contains 
    the specified sequence of char values
 */
public class P8 {
    public static void main(String[] args) {
        String s1 = "JaiShreeKrishna";
        // String s2 = "Shree Radhe";
        boolean flag = true;

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == ' ') {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println(s1 + " CONTAINS the specified sequence of char values");
        else
            System.out.println("Do Not contains the specified sequence of char values");
    }
}
