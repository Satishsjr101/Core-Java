class counLastStr {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String ch[] = s1.split(" ");
        System.out.println(ch[ch.length - 1].length());

    }
}