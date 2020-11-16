package basicprograms;

//Demonstrating String class methods
public class StringMethodsTest {
    
    public static void main(String[] args) {
        //args.length;
        String str1 = "My name is som"; //(2): using string literal
        int n = str1.length();
        char str2[] = new char[n]; //char array
        String str3 = "som";
        String str4 = "ron";
        String str5 = "SoM";
        String str6 = "som";
        System.out.println("Length of the String str1 : " + n); //14
        System.out.println("Character at position 3 is : " + str1.charAt(3)); //n
        char ch[] = str1.toCharArray();
        
        str1.getChars(0, n, str2, 0);
        System.out.print("The String str2 is : ");
        for (int i = 0; i < str2.length; i++) {
            System.out.print(str2[i]);
        }
        System.out.println();
      
        //System.out.println((int)str3.charAt(0));
        System.out.print("Comparision Test : ");
        if (str3.compareTo(str4) < 0) {
            System.out.print(str3 + " < " + str4);
        } else if (str3.compareTo(str4) > 0) {
            System.out.print(str3 + " > " + str4);
        } else {
            System.out.print(str3 + " equals " + str4);
        }
        System.out.println();

        System.out.print("Equals Test -> ");
        System.out.println("str3.equalsIgnoreCase(5) : " + str3.equalsIgnoreCase(str5));
        System.out.println("str3.equals(6) : " + str3.equals(str6));
        System.out.println("str1.equals(3) : " + str1.equals(str3));

        System.out.println(str5.toUpperCase()); //Strings are immutable
        System.out.println("str5 : " + str5);
        String temp = str5.toUpperCase();
        System.out.println("str5 Uppercase: " + temp);
        temp = str1.toLowerCase();
        System.out.println("str1 Lowercase: " + str1);
        System.out.println("str1.concat(str4): " + str1.concat(str4));

       
        String str7temp = "  \t\n Now for some Search and Replace Examples    ";
        String str7 = str7temp.trim();
        //str7 = Now for some Search and Replace Examples
        System.out.println("str7 : " + str7);
        String newStr = str7.replace('s', 'T');
        System.out.println("newStr : " + newStr);
        
        //str7 = Now for some Search and Replace Examples
        System.out.println("indexof Operations on Strings");
        System.out.println("Index of p in " + str7 + " : " + str7.indexOf('p')); //26
        System.out.println("Index of for in " + str7 + " : " + str7.indexOf("for")); //4
        System.out.println("str7.indexOf('p', 30) : " + str7.indexOf('p', 30)); //36
        System.out.println("str7.indexOf(for, 30) : " + str7.indexOf("for", 30)); //-1
        
        System.out.println("str7.lastIndexOf('p') : " + str7.lastIndexOf('p')); //36
        System.out.println("str7.lastIndexOf('p', 4) : " + str7.lastIndexOf('p', 4)); //-1
        System.out.println("str7.lastIndexOf('p', 38) : " + str7.lastIndexOf('p', 38)); //36
        System.out.println("str7.lastIndexOf(for, 10) : " + str7.lastIndexOf("for", 10)); //4

        String str = "0123456789";
        System.out.println(str.substring(5));    //1
        System.out.println(str.substring(3, 8)); //2
        
        System.out.println("SubString Operations on Strings");
        String str8 = "SubString Example";
        String sub5 = str8.substring(5); // "ring Example"
        String sub3_6 = str8.substring(3, 6); // "Str"
        System.out.println("str8 : " + str8);
        System.out.println("str8.substring(5) : " + sub5);
        System.out.println("str8.substring(3,6) : " + sub3_6);
    }
}
