import java.util.Scanner;

class Cone {
    // static members
    private double radius, height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double getVolume() {
        return ((1.0 / 3.0) * Math.PI * Math.pow(this.radius, 2) * this.height);
    }

    double getSurfaceArea() {
        return (Math.PI * this.radius
                * (this.radius + Math.sqrt((Math.pow(this.height, 2) + Math.pow(this.radius, 2)))));
    }
}

public class ConeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height:");
        double radius = sc.nextDouble(), height = sc.nextDouble();
        Cone cone = new Cone(radius, height);
        System.out.println("Volume: " + String.format("%.2f", cone.getVolume()));
        System.out.println("Surface Area: " + String.format("%.2f", cone.getSurfaceArea()));
        sc.close();
    }
}