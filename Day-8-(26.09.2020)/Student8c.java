import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Subject{
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
        return ("Subject Title = " + title + "; Internal marks = " + internal + "/30" + " Theory = " + theory
                +"/70" + "\n Total Marks =" +this.totalMarks+"\n");
    }
}

public class Student8c{
    String name, stream, college, semester;
    int rollNo;
    double totalMarks;

    Student8c(String name, String stream, String college, int rollNo, String semester,double Total, Subject...sub) {
        this.name = name;
        this.stream = stream;
        this.college = college;
        this.rollNo = rollNo;
        this.semester= semester;
        this.totalMarks = Total;

        for (Subject s : sub)
        {
            s.totalMarks = s.internal + s.theory;
        }

    }

    public String toString() {
        return "\nStudent Name = "+this.name + "\nRoll no = " + this.rollNo + "\nStream = " + this.stream + "\nSemester = " + this.semester + "\nCollege = "
                + this.college + "\nTotal Marks = "+this.totalMarks;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        double Total=0.0;
        String name, stream, college, semester;
        int rollNo, n;
        System.out.println("\n----------Student 1---------");
        System.out.print("Name: ");
        name = buf.readLine();
        System.out.print("Stream: ");
        stream = buf.readLine();
        System.out.print("Semester: ");
        semester = buf.readLine();
        System.out.print("College: ");
        college = buf.readLine();
        System.out.print("Roll no: ");
        rollNo = Integer.parseInt(buf.readLine());
        System.out.print("Number of Subjects: ");
        n = Integer.parseInt(buf.readLine());
        Subject[] subs = new Subject[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Subject " + (i + 1));
            System.out.print("Title: ");
            String title = buf.readLine();
            System.out.print("Internal Marks (Out of 30): ");
            double internal = Double.parseDouble(buf.readLine());
            System.out.print("Theory Marks (Out of 70): ");
            double theory = Double.parseDouble(buf.readLine());
            subs[i] = new Subject(title, internal, theory, internal + theory);
            Total+=internal + theory;
        }
        Student8c Student1 = new Student8c(name, stream, college, rollNo, semester, Total );
        Total=0.0;
        System.out.println("\n----------Student 2---------");
        System.out.print("Name: ");
        name = buf.readLine();
        System.out.print("Stream: ");
        stream = buf.readLine();
        System.out.print("Semester: ");
        semester = buf.readLine();
        System.out.print("College: ");
        college = buf.readLine();
        System.out.print("Roll no: ");
        rollNo = Integer.parseInt(buf.readLine());
        System.out.print("Number of Subjects: ");
        n = Integer.parseInt(buf.readLine());
        subs = new Subject[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Subject " + (i + 1));
            System.out.print("Title: ");
            String title = buf.readLine();
            System.out.print("Internal Marks (Out of 30): ");
            double internal = Double.parseDouble(buf.readLine());
            System.out.print("Theory Marks (Out of 70): ");
            double theory = Double.parseDouble(buf.readLine());
            subs[i] = new Subject(title, internal, theory, internal + theory);
            Total+=internal + theory;
        }
        Student8c Student2 = new Student8c(name, stream, college, rollNo, semester, Total );
        System.out.println("\n------------Student Information-----------");
        System.out.println(Student1.toString());
        System.out.println(Student2.toString());
    }
}