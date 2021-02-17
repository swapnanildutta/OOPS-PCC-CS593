public class ObjectCloningEx {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Rohit", "Delhi", 95725.75);
        System.out.println(e1);
        Employee e2 = null;
        try {
            e2 = (Employee) e1.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }
        if (e1 == e2)
            System.out.println("same memory location");
        else
            System.out.println("different memory location");
    }
}

class Employee implements Cloneable {
    int id;
    String name;
    String address;
    double salary;

    Employee(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + '}';
    }
}