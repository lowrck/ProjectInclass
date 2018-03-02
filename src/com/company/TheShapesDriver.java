import java.util.Scanner;


public class TheShapesDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, height;
        System.out.println("Please enter radius: ");
        radius = input.nextDouble();
        System.out.println("Please enter height: ");
        height = input.nextDouble();
        TheShapes shapes = new TheShapes(radius, height);
        System.out.println("The cone volume of " + shapes.radius + " with a height of " + shapes.height + " is " + shapes.coneVolume());
        System.out.println("The cylinder volume of " + shapes.radius + " with a height of " + shapes.height + " is " + shapes.cylinderVolume() );
        System.out.println("thePI is " + TheShapes.thePI);
    }

}
