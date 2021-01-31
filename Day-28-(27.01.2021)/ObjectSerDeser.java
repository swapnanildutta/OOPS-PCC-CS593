//Object Serialization and Deserialization Example
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Object serialization is the process of writing the state of an object to a byte stream (persistent storage area)
//Object deserialization is used to restore the objects back into the program

//only the data of the class object (including class name) is saved, but not the class definition
class Student implements Serializable {
    //the static and transient variables are not saved
    int roll;
    String name;
    double grade;

    public Student(int roll, String name, double grade) {
        this.roll = roll;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "roll=" + roll + ", name=" + name + ", grade=" + grade + '}';
    }    
}

//Main program
public class ObjectSerDeser {
    
    //Java offers high-level streams such as ObjectOutputStream and ObjectInputStream 
    public static void main(String[] args) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
        FileInputStream fin = null;
        ObjectInputStream ois = null;
        Student st[] = new Student[3]; //an array of objects
        Student s;
        
        //array initialization
        st[0] = new Student(101, "Rahul", 8.15);
        st[1] = new Student(102, "Sanmay", 8.75);
        st[2] = new Student(103, "Sagun", 8.85);
        
        //Object serialization
        try {
            //fout = new ObjectOutputStream(new FileOutputStream("serial.txt"));
            fout = new FileOutputStream("serial.txt");
            oos = new ObjectOutputStream(fout);
            oos.writeObject(st[0]);
            oos.writeObject(st[1]);
            oos.writeObject(st[2]);
            System.out.println("Object serialization is done..\n");
            
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                fout.close();
                oos.close();
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
        
        //Object deserialization
        try {
            //fin = new ObjectInputStream(new FileInputStream("serial.txt"));
            fin = new FileInputStream("serial.txt");
            ois = new ObjectInputStream(fin);
            
            System.out.println("Object deserialization started..");
            for (int i = 0; i < st.length; i++) {
                s = (Student)ois.readObject(); //explicting casting is needed
                System.out.println(s);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                fin.close();
                ois.close();
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
        
    } //end of main() method
    
} //end of ObjectSerDeser class
