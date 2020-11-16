package p2;

import p1.Parent1;

class New extends Parent1{
    public static void main(String[] args)
    {
       New ob=new New();
       System.out.println(ob.data+" "+ob.value);
       ob.show();
       ob.display();
    }
}