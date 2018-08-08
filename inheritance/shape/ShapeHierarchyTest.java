package inheritance.shape;

/**
 * Created by thatp on 6/12/2017.
 */
public class ShapeHierarchyTest {
    //this is the main method for testing the code
    public static void main(String[] args){

        //create empty circle object
        //with creation notification
        Circle c1 = new Circle();
        System.out.println("The circle created is "+ c1);

        //create custom circle object
        //with creation notification
        Circle c2 = new Circle("red", 5.0);
        System.out.println("The circle created is "+ c2);

        //skip line
        System.out.println();

        //create empty rectangle object
        //with creation notification
        Rectangle r1 = new Rectangle();
        System.out.println("The rectangle created is "+r1);

        //create rectangle object
        //with creation notification
        Rectangle r2 = new Rectangle("blue", 4.0, 2.0);
        System.out.println("The rectangle created is "+r2);

        //skip line
        System.out.println();

        //create empty cube object
        //with creation notification
        Cube cube1 = new Cube();
        System.out.println("The cube created is " +cube1);

        //create cube object
        //with creation notification
        Cube cube2 = new Cube("orange",2.0);
        System.out.println("The cube created is " + cube2);

        //create an array to hold any shape
        Shape[] shapes = new Shape[6];
        shapes[0] = c1;
        shapes[1] = c2;
        shapes[2] = r1;
        shapes[3] = r2;
        shapes[4] =cube1;
        shapes[5] =cube2;

        //prints message saying array objects are being printed
        System.out.printf("%nPrinting the array object . . .%n");

        //this was put here to show you can't print an array like this
        System.out.println(shapes);

        //I am using a for loop to print the array
        for (int i=0; i<shapes.length; i++){
            System.out.println(shapes[i]+ "\n");
        }
        //calling this method is another way to print the array
        printArray(shapes);

    }
    //this method prints whatever array is put into it
    private static void printArray(Object[] theArray) {
        System.out.printf("%nPrinting each element in the array . . .%n");
        for (int x=0; x < theArray.length; x++){
            System.out.println("Element "+ x + " is " + theArray[x]);
        }
    }
}
