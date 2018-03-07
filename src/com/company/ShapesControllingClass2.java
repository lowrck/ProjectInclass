import java.util.Scanner;

public class ShapesControllingClass2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int switchValue = 1, i = 0;
        int[] switchValues = new int[10];
        TheShapes[] shapes = new TheShapes[10];
        menuPrint();
        while(switchValue != 5) {
            switchValue = input.nextInt();

            switch (switchValue) {
                case 1: {
                    System.out.println("Please enter radius: ");
                    TheShapes Sphere = new TheShapes(input.nextDouble());
                    shapes[i] = Sphere;
                    switchValues[i] = switchValue;
                    menuPrint();
                    break;

                }
                case 2: {
                    float radius, height;
                    System.out.println("Please enter radius: ");
                    radius = input.nextFloat();
                    System.out.println("Please enter height: ");
                    height = input.nextFloat();

                    TheShapes Cylinder = new TheShapes(radius, height);
                    shapes[i] = Cylinder;
                    switchValues[i] = switchValue;
                    menuPrint();
                    break;

                }
                case 3: {
                    float radius, height;
                    System.out.println("Please enter radius: ");
                    radius = input.nextFloat();
                    System.out.println("Please enter height: ");
                    height = input.nextFloat();

                    TheShapes Cone = new TheShapes(radius, height);
                    shapes[i] = Cone;
                    switchValues[i] = switchValue;
                    menuPrint();
                    break;

                }
                case 4: {
                    float length, width, height;
                    System.out.println("Please enter length: ");
                    length = input.nextFloat();
                    System.out.println("Please enter width: ");
                    width = input.nextFloat();
                    System.out.println("Please enter height: ");
                    height = input.nextFloat();



                    TheShapes Pyramid = new TheShapes(length, width, height);
                    shapes[i] = Pyramid;
                    switchValues[i] = switchValue;
                    menuPrint();
                    break;

                }
                case 5: {
                    if(i > 1) {
                        System.out.print("\n\n\n");
                    }
                    break;
                }
            }
            i++;
        }
        for(int j = 0; j < i; j++) {
            switch(switchValues[j]) {
                case 1: {
                System.out.printf("Sphere with a radius of %.4f has a volume of %.4f\n", shapes[j].radius, shapes[j].sphereVolume());
                break;
                }
                case 2: {
                System.out.printf("Cone with a radius of %.4f with a height of %.4f has a volume of %.4f\n", shapes[j].radius, shapes[j].height , shapes[j].coneVolume());
                break;
                }
                case 3: {
                    System.out.printf("Cylinder with a radius of %.4f with a height of %.4f has a volume of %.4f\n", shapes[j].radius, shapes[j].height , shapes[j].cylinderVolume());
                    break;
                }
                case 4: {
                    System.out.printf("Pyramid with a length of %.4f and a width of %.4f and a height of %.4f has a volume of %.4f\n", shapes[j].length , shapes[j].width , shapes[j].height , shapes[j].pyramidVolume());
                    break;
                }
                case 5: {
                break;
                }
            }
        }





    }



    static void menuPrint() {
        System.out.println("|--------+---------|");
        System.out.println("|       Menu       |");
        System.out.println("--------------------");
        System.out.println("|     1. Sphere    |");
        System.out.println("|     2. Cone      |");
        System.out.println("|     3. Cylinder  |");
        System.out.println("|     4. Pyramid   |");
        System.out.println("|     5. End       |");
        System.out.println("|--------+---------|");
        System.out.println("Please enter the number of the menu item: ");
    }

}
