public class ArgumentInput {
    public static void main(String[]args){
        int a=0,b=0,c=0,r=0;
        String name= new String();
        r = Integer.parseInt(args[0]);
        name = args[1];
        a = Integer.parseInt(args[2]);
        b = Integer.parseInt(args[3]);
        c = a + b;
        System.out.println("Roll: " + r);
        System.out.println("Name: " + name);
        System.out.println("Sum=" + c);
    }
}