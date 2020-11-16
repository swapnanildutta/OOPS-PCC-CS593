public class InterfaceTest {
    public static void main(String[] agrs)
    {
        System.out.println("Pi-"+Figure.pi);
        Figure f=new Rectangle();
        System.out.println("Area-"+f.compArea(5.6, 4.2));
        f=new Circle();
        System.out.println("Area-"+f.compArea(4, 0));
    }
}

interface Figure
{
    double pi=3.14;
    double compArea(double l, double b); //public and abstract

}

class Rectangle implements Figure
{
    public double compArea(double l, double b)
    {
        return l*b;
    }
}

class Circle implements Figure
{
    public double compArea(double l, double b)
    {
        return pi*l*l;
    }
}
 
