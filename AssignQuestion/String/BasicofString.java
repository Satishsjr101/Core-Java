
class BasicOfString {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        char[] ch = { 'h', 'e', 'l', 'l', 'o' };
        // String s3=new String(ch[]);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
