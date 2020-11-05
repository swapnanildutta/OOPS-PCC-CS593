class Outer4{
    int y=50;
    public void show() {
        System.out.println("This is the outer class");
    }
    class Inner4{
        void display()
        {
            show();
            System.out.println("Y="+y);
            System.out.println("This is the Inner Class");
        }
    }
}
class Ass4Q2{
    public static void main(String[] args)
    {
        new Outer4().new Inner4().display();
    }
}