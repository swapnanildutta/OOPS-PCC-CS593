public class BasicInput{
    public static void main(String[] args) throws Exception{
        char ch;
        String s="",name="",roll ="";
        double d1,d2;

        System.out.println("Enter your name: ");
        while ((ch=(char)System.in.read())!='\n'){
            name+=ch;
        }
        System.out.println("Enter your roll: ");
        while ((ch=(char)System.in.read())!='\n'){
            s+=ch;
        }
        roll=s;
        s="";
        System.out.println("Enter two marks: ");
        while ((ch=(char)System.in.read())!='\n'){
            s+=ch;
        }
        d1=Double.parseDouble(s);
        s="";
        while ((ch=(char)System.in.read())!='\n'){
            s+=ch;
        }
        d2=Double.parseDouble(s);

        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
        System.out.println("Total Marks : "+(d1+d2));
    }
}