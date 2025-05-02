public class Circle extends Shape implements Moveable,Resizeable{
    private double radius;
    private Point center;
    static int circleCount = 0;
    static double circlesArea = 0;

    public Circle(String color, double radius, double centerX, double centerY, double xSpeed, double ySpeed) {
        super(color, 3.14 * radius * radius);
        this.radius = radius;
        this.center = new Point(centerX,centerY,xSpeed,ySpeed);
        this.circleCount++;
        this.circlesArea += this.getArea();
    }

    @Override
    public void move(String side) {
        this.center.move(side);
    }

    @Override
    public void resize(int percentage) {
        this.radius += this.radius * percentage / 100;
    }

    @Override
    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle:\n ID: " + super.getId() + "\n Color: " + super.getColor() + "\n Created Date: " +
                super.getCreatedDate() + "\n Radius: " + this.radius + "\n Center: (" + this.center.getX() +
                "," + this.center.getY() + ")\n Circle Count: " + circleCount + "\n Area: " + this.getArea() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle otherCircle = (Circle) obj;
            return this.getId() == otherCircle.getId();
        }
        return false;
    }
}
