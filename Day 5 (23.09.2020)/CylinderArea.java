import java.util.Scanner;

class Cylinder {
    // static members
    private double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double getVolume() {
        return (2 * Math.PI * Math.pow(this.radius, 2) * this.height);
    }

    double getSurfaceArea() {
        return (2 * Math.PI * this.radius * (this.radius + this.height));
    }
}

public class CylinderArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height:");
        double radius = sc.nextDouble(), height = sc.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Volume: " + String.format("%.2f", cylinder.getVolume()));
        System.out.println("Surface Area: " + String.format("%.2f", cylinder.getSurfaceArea()));
        sc.close();
    }
}