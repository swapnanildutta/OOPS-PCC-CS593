class Subjects
{
    String code, title;
    int part1, part2, marks = 0;

    public Subjects(String code, String title, int part1, int part2)
    {
        this.code=code;
        this.title=title;
        this.part1=part1;
        this.part2=part2;
    }
}

class Student
{
    String name, stream;
    int roll, total = 0, count = 0;

    public Student(int roll, String name, String stream, Subjects[] sub)
    {
        this.name=name;
        this.roll=roll;
        this.stream=stream;
        for(Subjects s : sub)
        {
            s.marks = s.part1 + s.part2;
            System.out.println("Code: " + s.code + " Title: " + s.title + " Marks: " + s.marks);
            total += s.marks;
            count++;
        }
    }

    public String toString()
    {
        return "\nName: " + name + "\nRoll: " + roll + "\nStream: " + stream + "\nTotal " + total;
    }
}

public class Student8b
{
    public static void main(String[] args)
    {
        Subjects sub[] = new Subjects[3];
        System.out.println("----------------Student Details---------------");
        System.out.println("\n-----------------Student 1-------------------");
        sub[0] = new Subjects(" IT501", "Object Oriented Programming", 32, 54);
        sub[1] = new Subjects(" IT502", "Computer Organisation", 36, 54);
        sub[2] = new Subjects(" IT503", "Data Structures", 28, 48);
        Student s1 = new Student(12, "Swapnanil Dutta", "IT", sub);

        System.out.println("\n-----------------Student 2-------------------");
        sub[0] = new Subjects(" CSE501", "Object Oriented Programming", 40, 49);
        sub[1] = new Subjects(" CSE502", "Computer Organisation", 34, 53);
        sub[2] = new Subjects(" CSE503", "Data Structures", 29, 58);
        Student s2 = new Student(114, "Debdut Goswami", "CSE", sub);

        System.out.println(s1);
        System.out.println(s2);
    }
}