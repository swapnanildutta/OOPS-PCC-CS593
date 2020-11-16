class Parent {
    private String name, add;
    public long id;
    public Parent(String n, String a, long i)
    {
        name=n;
        add=a;
        id=i;
    }  
    public void displayDetails()
    {
        System.out.println("Name-"+name+" Id-"+id);
        System.out.println("Address-"+add);
    }
}
class ChildOne extends Parent
{
    private double marks;
    public ChildOne(String n, String a, long i, double m)
    {
        super(n, a, i);
        marks=m;
    }
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Marks-"+marks);
    }
}
class ChildTwo extends Parent
{
    private double salary;
    private String qualification;
    public ChildTwo(String n, String a, long i, double sal, String qua)
    {
        super(n, a, i);
        salary=sal;
        qualification=qua;
    }
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Qualification-"+qualification+" Salary-"+salary);
    }
}
class TestParent
{
    public static void main(String[] args)
    {
        Parent par=new Parent("Debjit Nag", "Jirat, Kaliagarh Rabindrapally, pin-712501, dist-Hooghly, po-Balagarh", 1);
        ChildOne ch1=new ChildOne("Swanmoy Nag", "Jirat, Kaliagarh Rabindrapally, pin-712501, dist-Hooghly, po-Balagarh", 2, 99);
        ChildTwo ch2=new ChildTwo("EvilGenius", "Jirat, Kaliagarh Rabindrapally, pin-712501, dist-Hooghly, po-Balagarh", 3, 150000, "B-Tech");
        par.displayDetails();
        ch1.displayDetails();
        ch2.displayDetails();
    }
}
