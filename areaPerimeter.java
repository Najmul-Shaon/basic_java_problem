import java.util.Scanner;

public class areaPerimeter {
  public static void main(String[] args) {
    final double PI = 3.14159;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the radius of the circle: ");
    double radius = scanner.nextDouble();

    double area = PI * radius * radius;
    double perimeter = 2 * PI * radius;

    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
  }
}
