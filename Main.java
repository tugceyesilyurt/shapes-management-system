public class Main {
    public static void main(String[] args) {
        System.out.println("Creating Shapes Cart...");
        ShapesCart shapesCart = new ShapesCart();

        System.out.println("Creating Three Circles...");
        Circle circle1 = new Circle("red", 5, 10,10 , 2,2);
        Circle circle2 = new Circle("blue", 3, 8,8 , 2,2);
        Circle circle3 = new Circle("yellow", 2, 6,6 , 2,2);

        System.out.println("Adding Circles to Shapes Cart...");
        shapesCart.addShape(circle1);
        shapesCart.addShape(circle2);
        shapesCart.addShape(circle3);

        System.out.println("Total Area of Shapes Cart: " + shapesCart.getTotalArea());

        System.out.println("Removing Second Circle from Shapes Cart Second Circle Area: " + circle2.getArea());
        shapesCart.removeShape(circle2);

        System.out.println("Total Area of Shapes Cart: " + shapesCart.getTotalArea());

        System.out.println("\nPrinting All Shapes in Shapes Cart...\n");
        shapesCart.printAllShapes();

        System.out.println("Creating Another Shapes Cart...");
        ShapesCart shapesCart2 = new ShapesCart();

        System.out.println("Creating Rectangle...");
        Rectangle rectangle1 = new Rectangle("green", 8, 10,10 , 2,2, 2);

        System.out.println("Adding Rectangle to Second Shapes Cart...");
        shapesCart2.addShape(rectangle1);

        System.out.println("Total Area of Second Shapes Cart: " + shapesCart2.getTotalArea());

        System.out.println("Printing All Shapes in Second Shapes Cart...");
        shapesCart2.printAllShapes();

        System.out.println("Comparing First and Second Shapes Carts...");
        if (shapesCart.equals(shapesCart2)) {
            System.out.println("First and Second Shapes Carts are Equal");
        } else {
            System.out.println("First and Second Shapes Carts are Not Equal");
        }

        System.out.println("Printing Info of Third Circle...");
        System.out.println(circle3);

        System.out.println("Resizing Third Circle...\n");
        circle3.resize(3);


        // for extra 10 point
        System.out.println("Printing Info of Rectangle...");
        System.out.println(rectangle1);

        System.out.println("\nResizing Rectangle...\n");
        rectangle1.resize(25);

        System.out.println("Printing Info of Rectangle...");
        System.out.println(rectangle1);
    }
}