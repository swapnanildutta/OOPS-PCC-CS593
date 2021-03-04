
/*
    Name: Swapnanil Dutta
    Roll: 16900218012
    Question: 12 B
*/
import java.util.Scanner;

class Circle {
    // static members
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    double getCircumference() {
        return (2 * Math.PI * this.radius);
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area: " + String.format("%.2f", circle.getArea()));
        System.out.println("Circumference: " + String.format("%.2f", circle.getCircumference()));
        sc.close();
    }
}
