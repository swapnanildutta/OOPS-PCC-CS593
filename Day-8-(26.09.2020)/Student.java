import java.util.Scanner;
public class Student{
    String Name,Stream,College,name,stream,college;
    int rollNo,RollNo;

    Student(String Name,int rollNo,String Stream,String College){
        this.Name=Name;
        this.rollNo=rollNo;
        this.Stream=Stream;
        this.College=College;
    }

    void display(){
        System.out.println("\nName: "+Name+" \nRoll No: "+rollNo+" \nStream: "+Stream+" \nCollege: "+College);

    }
    public static void main(String[]args){
        System.out.println("-------------------------Input Student Details--------------------------");
        Scanner st=new Scanner(System.in);
        System.out.print("\nEnter The Name of 1st Student: ");
        String Name = new Scanner(System.in).nextLine();
        System.out.print("Enter Roll No: ");
        int rollNo = st.nextInt();
        System.out.print("Enter Stream: ");
        String Stream = new Scanner(System.in).nextLine();
        System.out.print("Enter College: ");
        String College = new Scanner(System.in).nextLine();
        Student s=new Student(Name,rollNo,Stream,College);
        System.out.print("\nEnter The Name of 2nd Student: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter Roll No: ");
        int RollNo = st.nextInt();
        System.out.print("Enter Stream: ");
        String stream = new Scanner(System.in).nextLine();
        System.out.print("Enter College: ");
        String college = new Scanner(System.in).nextLine();
        Student t=new Student(name,RollNo,stream,college);
        System.out.print("---------------------------Student Details---------------------------------");
        s.display();
        t.display();
    }
}