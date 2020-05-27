package siit.app;

import siit.Shapes;
import siit.shapes.Circle;
import siit.shapes.Rectangle;

import java.util.Scanner;

public class ShapesApp {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        boolean action = true;
        while (action) {
            System.out.println("Press 1 to add a rectangle to the list");
            System.out.println("Press 2 to add a circle  to the list");
            System.out.println("Press 3 to get the total perimeter of the shapes in the list");
            System.out.println("Press 4 to exit");

            try {
                String n = sc.next();
                if (n.equals("1")) {
                    System.out.println("Insert length");
                    int length = sc.nextInt();
                    System.out.println("Insert width");
                    int width = sc.nextInt();

                    Rectangle rectangle = new Rectangle(length, width);
                    shapes.addShape(rectangle);
                } else if (n.equals("2")) {
                    System.out.println("Insert the radius: ");
                    int raza = sc.nextInt();
                    Circle c = new Circle(raza);
                    shapes.addShape(c);
                } else if (n.equals("3")) {
                    System.out.println("Total perimeter is -> " + shapes.getTotalPerimeter());
                } else if (n.equals("4")) {
                    System.out.println("You exit");
                    action = false;
                } else {
                    System.out.println("Invalid option!");
                }
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
