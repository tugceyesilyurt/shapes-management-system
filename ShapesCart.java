public class ShapesCart {
    Shape[] shapes = new Shape[10];

    public void addShape(Shape shape){
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null){
                shapes[i] = shape;
                break;
            }
        }
    }

    public void removeShape(Shape shape){
        for (int i = 0; i < shapes.length; i++) {
            if(shape.equals(shapes[i])){
                shapes[i] = null;
                break;
            }
        }
    }

    public double getTotalArea(){
        double totalArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] != null){
                totalArea += shapes[i].getArea();
            }
        }
        return totalArea;
    }

    public void printAllShapes(){
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] != null){
                System.out.println(shapes[i]);
            }
        }
    }

    public boolean equals(ShapesCart shapesCart){
        return this.getTotalArea() == shapesCart.getTotalArea();
    }
}
