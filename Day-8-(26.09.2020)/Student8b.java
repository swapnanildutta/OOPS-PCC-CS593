import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Subject {
    String title;
    double internal, theory, totalMarks;

    Subject(String title, double internal, double theory, double totalMarks) 
    {
        this.title = title;
        this.internal = internal;
        this.theory = theory;
        this.totalMarks= internal + theory;
    }

    public String toString() 
    {
        return ("Subject Title = " + title + "; Internal marks = " + internal + "/50" + " Theory = " + theory
                +"/70" + "\n Total Marks =" +this.totalMarks+"\n");
    }
}

public class Student8b{
    Subject[] subs = new Subject[3];
    String name, stream, college;
    int rollNo;
    double totalMarks;

    Student8b(String name, String stream, String college, int rollNo, Subject[] subs, double Total) {
        this.name = name;
        this.stream = stream;
        this.college = college;
        this.rollNo = rollNo;
        this.totalMarks = Total;

        for (int i = 0; i < 3; i++)
            this.subs[i] = subs[i]; 
    }

    public String toString() {
        return "\nStudent Name =  "+this.name + "\nRoll no = " + this.rollNo + "\nStream = " + this.stream + "\nCollege = "
                + this.college + "\nTotal Marks = "+this.totalMarks+"/360";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        double Total=0.0;
        Subject[] subs = new Subject[3];
        String name, stream, college;
        int rollNo;
        System.out.print("Name: ");
        name = buf.readLine();
        System.out.print("Stream: ");
        stream = buf.readLine();
        System.out.print("College: ");
        college = buf.readLine();
        System.out.print("Roll no: ");
        rollNo = Integer.parseInt(buf.readLine());
        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Subject " + (i + 1));
            System.out.print("Title: ");
            String title = buf.readLine();
            System.out.print("Internal Marks: ");
            double internal = Double.parseDouble(buf.readLine());
            System.out.print("Theory Marks: ");
            double theory = Double.parseDouble(buf.readLine());
            subs[i] = new Subject(title, internal, theory, internal + theory);
            Total+=internal + theory;
        }
        Student8b Student = new Student8b(name, stream, college, rollNo, subs, Total );
        System.out.println(Student.toString());
    }
}