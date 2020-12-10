import java.io.*;
class Super1
{
    void test(){
        System.out.println("Method test of Super1 class");
    }
    void test1(){
        System.out.println("Method Test1 of Super1 class");
    }
}
class Subsub1 extends Super1
{
    void test()// can't use "throws IOException" as super class method does not use any exception
    {
        System.out.println("Method test of Subsub1 class");
    }
    void test1() throws NumberFormatException 
    {
        System.out.println("Method test1 of Subsub1 class");//but sub class can throw unchecked exception
    }
    public static void main(String args[]) throws IOException
    {
        Super1 ob=new Subsub1();
        ob.test();
        ob.test1();
    }

}
class Super2
{
    void test() throws IndexOutOfBoundsException
    {
        System.out.println("Method test of Super2 class");
    }
    void test1() throws IndexOutOfBoundsException
    {
        System.out.println("Method test1 of Super2 class");
    }
    void test2() throws IndexOutOfBoundsException
    {
        System.out.println("Method test2 of Super2 class");
    }
    void test3() throws IndexOutOfBoundsException
    {
        System.out.println("Method test3 of Super2 class");
    }
}
class Subsub2 extends Super2
{
    void test() throws IndexOutOfBoundsException
    {
        System.out.println("Method test of Subsub2 class");//sub class can throw the same exception
    }
    void test1() throws StringIndexOutOfBoundsException
    {
        System.out.println("Method test1 of Subsub2 class");//sub class can throw the sub class exception 
    }
    void test2()
    {
        System.out.println("Method test2 of Subsub2 class");//sub class may not throw any exception
    }
    void test3()//can't use "throws Exception" as sub class cant throw the superclass exception
    {
        System.out.println("Method test3 of Subsub2 class");
    }
    public static void main(String[] args)
    {
        Super2 ob=new Subsub2();
        ob.test();
        ob.test1();
        ob.test2();
        ob.test3();
    }
}