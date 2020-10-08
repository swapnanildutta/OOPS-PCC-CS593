class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return "Id = " + this.id + "\nName = " + this.name + "\n";
    }
}

class Scientist extends Employee {
    int no_of_publication;
    String experience;
    Scientist (int id, String name, int no_of_publication, String experience) {
        super(id, name);
        this.no_of_publication = no_of_publication;
        this.experience = experience;
    }
    public String toString() {
        return super.toString() + "Publications = " + this.no_of_publication + "\nExperience = " + this.experience + "\n";
    }
}

public class DScientist extends Scientist {
    String award;
    DScientist(int id, String name, int no_of_publication, String experience, String award) {
        super(id, name, no_of_publication, experience);
        this.award = award;
    }
    public String toString() {
        return super.toString() + "Awards = " + this.award;
    }
    public static void main(String[] args) {
        Employee em = new Employee(712541, "Swagato Patra");
        Scientist st = new Scientist(712454, "Abhishek Pal", 2, "Junior Scientist");
        DScientist ds = new DScientist(712136, "Swapnanil Dutta", 5, "Senior Scientist", "Employee of the month");

        System.out.println("----------------------Details--------------------------");
        System.out.println(em+"\n");
        System.out.println(st+"\n");
        System.out.println(ds+"\n");
    }
}