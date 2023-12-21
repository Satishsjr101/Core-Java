/*12. Write a Java program to check whether two String objects 
    contain the same data
 */
public class P12 {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String();
        s1 = "Hello";
        s2 = "Hello";
        System.out.println(s1.contains(s2));
    }
}
