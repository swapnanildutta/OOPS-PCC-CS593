// Object Cloning Example with java.lang.Cloneable interface (i.e. Marker interface)
// Object Cloning in Java refers to the creation of exact copy of an object
// Marker interface is an empty interface without any field or method in it
// It is used to provide some special instruction to JVM or Java compiler

class Employee implements Cloneable { // step 1
    int id;
    String name;
    String address;
    double salary;

    // constructor
    Employee(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    // public > protected > default > private
    @Override
    protected Object clone() throws CloneNotSupportedException { // step 2
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + '}';
    }
}

public class ObjectCloningExample {

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Rohit", "Delhi", 95725.75);
        System.out.println(e1);
        Employee e2 = null;

        // object cloning
        try { // step 3
            e2 = (Employee) e1.clone(); // downcasting or expicit typecasting
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }

        // memory location comparison
        if (e1 == e2)
            System.out.println("same memory location");
        else
            System.out.println("different memory location");
    }
}
