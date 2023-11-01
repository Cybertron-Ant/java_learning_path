import java.util.Scanner;

/* takes two numbers as input and prints the area and perimeter of a rectangle */
public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.printf("Area is %.2f * %.2f = %.2f%n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.2f + %.2f) = %.2f%n", width, height, perimeter);
    }
}
