public class TestMethod
{
    int a;
    TestMethod(int a){
        this.a=a;
    }
    TestMethod returnObj(TestMethod obj){
        TestMethod t= new TestMethod(obj.a+10);
        return t;
    }
    public static void main(String[] args){
        TestMethod t1=new TestMethod(10);
        System.out.println("t1.a= "+t1.a);
        TestMethod t2=t1.returnObj(t1);
        System.out.println("t2.a= "+t2.a);
        TestMethod t3=t2.returnObj(t2);
        System.out.println("t3.a= "+t3.a);
    }
}