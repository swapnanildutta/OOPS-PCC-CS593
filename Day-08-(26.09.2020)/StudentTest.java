package specialtest;

class Subject {
    String code, title;
    int part1, part2, marks = 0;

    public Subject(String code, String title, int part1, int part2) {
        this.code = code;
        this.title = title;
        this.part1 = part1;
        this.part2 = part2;
    }

}

class Student {
    int roll, total = 0, count=0;
    String name, stream;

    public Student(int roll, String name, String stream, Subject... sub) {
        this.roll = roll;
        this.name = name;
        this.stream = stream;

        for (Subject s : sub) {
            s.marks = s.part1 + s.part2;
            System.out.println("Code: " + s.code + "; Title: " 
                                  + s.title + "; Marks: " + s.marks);
            total += s.marks;
            count++;
        }
    }

    public String toString() {
        double avg = (double)total/(double)count;
        return "Roll: " + roll + "; Name: " + name + "; Stream: " + stream 
                        + "; Total: " + total+"; AVG: " + avg + "\n";
    }

}

public class StudentTest {
    
    public static void main(String[] args) {
        System.out.println("Display Information");
        System.out.println("===================");
        
        //For Student 1
        System.out.println("Student 1:~");
        Student s1 = new Student(101, "Sanjay Sharma", "IT", 
                         new Subject("IT301", "CO", 27, 52), 
                         new Subject("IT302", "DS", 26, 50));
        System.out.println(s1);
        
        //For Student 2
        System.out.println("Student 2:~");
        Student s2 = new Student(102, "Smriti Paul", "CSE", 
                         new Subject("CS301", "CO", 25, 45), 
                         new Subject("CS302", "DS", 35, 55), 
                         new Subject("CS303", "C++", 30, 50));
        System.out.println(s2);
    }
}
