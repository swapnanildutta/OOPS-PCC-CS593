package specialtest;

class Subjects {
    String code, title;
    int part1, part2, marks = 0;

    public Subjects(String code, String title, int part1, int part2) {
        this.code = code;
        this.title = title;
        this.part1 = part1;
        this.part2 = part2;
    }

}

class Students {
    int roll, total = 0, count=0;
    String name, stream;

    public Students(int roll, String name, String stream, Subjects[] sub) {
        this.roll = roll;
        this.name = name;
        this.stream = stream;
        
        for (Subjects s : sub) {
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
                        + "; Total: " + total+"; AVG: " + avg;
    }

}

public class SpecialTest {

    public static void main(String[] args) {
        //subject array declaration and instantiation
        Subjects sub[] = new Subjects[3]; //assuming 3 subjects
        
        System.out.println("Display Information");
        System.out.println("===================");
        
        //subject array initialiization for first time
        System.out.println("Student 1:~");
        sub[0] = new Subjects("IT301", "CO", 27, 52);
        sub[1] = new Subjects("IT302", "DS", 26, 50);
        sub[2] = new Subjects("IT303", "C++", 22, 51);
        Students s1 = new Students(101, "Sanjay Sharma", "IT", sub);
        System.out.println(s1);
        
        //subject array initialiization for second time
        System.out.println("\nStudent 2:~");
        sub[0] = new Subjects("CS301", "CO", 25, 45); 
        sub[1] = new Subjects("CS302", "DS", 35, 55); 
        sub[2] = new Subjects("CS303", "C++", 30, 50);
        Students s2 = new Students(102, "Smriti Paul", "CSE", sub);                         
        System.out.println(s2);
    }
    
}
