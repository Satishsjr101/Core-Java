public class string1{
    public static void main(String args[]){
        String s1 = "Hello";
        String empty = "";
        String s2 = new String("Hello");
        
        String s3 = "Satish Vishwakarma.";
        String s4 = new String("Hello");
        // System.out.println("S1==S2:" + (s1==s2));
        // System.out.println("S1==S3:" + (s1==s3));
        // System.out.println("S2==S4:" + (s2==s4));
    //     char ch = s1.charAt(3);
    //     System.out.println("character:"+ch);
    //     int l = s1.length();
    //     System.out.println("Length :"+l);
    //    String sub = s1.substring(7);
    //    System.out.println("Sunstring(7):"+sub);
    //    String sub2 = s1.substring(0,17);
    //    System.out.println("Sunstring(0,7):"+sub2);
    //    System.out.println("Contains:"+ s1.contains("Satish"));
    //    System.out.println("Equal:"+ empty.isEmpty());

        System.out.println("S1==S2:" + (s1==s2));
        System.out.println("s1.equal(s2):"+(s1.equals(s2)));
        System.out.println("s1.compareTo(s2):"+(s1.compareTo(s2)));
        System.out.println("Equal:"+ empty.isEmpty());
        System.out.println("concat:"+ s1.concat(" world"));
        System.out.println("Replace: "+ s1.replace('o', 'O'));
        System.out.println("Replace: "+ s1.replace("Hello", "Hey"));
      
    String s11 = "This is programmers point";
    String[] arr = s11.split(" ");
    System.out.println("Arr[]:"+ (arr[0]));
   }
}