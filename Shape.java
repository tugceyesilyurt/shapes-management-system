import java.util.Date;

abstract class Shape {
    private final int id;
    private String color;
    private final Date createdDate;

    static int shapeCount = 0;
    static double shapesArea = 0;

    public Shape(String color, double shapeArea) {
        this.id = ++shapeCount;
        this.color = color;
        this.createdDate = new Date();
        shapesArea += shapeArea;
    }

    public int getId() {
        return id;
    }

    public static int getShapeCount() {
        return shapeCount;
    }

    public String getColor() {
        return color;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public abstract double getArea();
}
