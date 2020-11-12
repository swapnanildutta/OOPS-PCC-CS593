package test;

public class StringTest {

    public static void main(String[] args) {
        String s1 = "india"; //string constant => pool area
        String s2 = new String("india"); //string object => non-pool area
        String s3 = s2.intern();

        if (s1 == s2) {
            System.out.println("s1 and s2 has same memory location");
        } else {
            System.out.println("s1 and s2 has diffrent memory location");
        }

        if (s1 == s3) {
            System.out.println("s1 and s3 has same memory location");
        } else {
            System.out.println("s1 and s3 has diffrent memory location");
        }

        if (s2 == s3) {
            System.out.println("s2 and s3 has same memory location");
        } else {
            System.out.println("s2 and s3 has diffrent memory location");
        }

        if (s1.equals(s2)) {
            System.out.println("s1 and s2 are equal");
        }
        if (s1.equals(s3)) {
            System.out.println("s1 and s3 are equal");
        }
        if (s2.equals(s3)) {
            System.out.println("s2 and s3 are equal");
        }

        //Strings are immutable
        String str1 = "mother";
        System.out.println(str1.concat("land"));
        System.out.println("str1 = " + str1);
        String str2 = str1.concat("land");
        System.out.println("str2 = " + str2);
    }
}
