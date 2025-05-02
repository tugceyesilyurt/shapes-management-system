public class Rectangle extends Shape implements Moveable, Resizeable {
    private Point topLeft;
    private Point bottomRight;

    static int rectangleCount = 0;
    static double rectanglesArea = 0;

    public Rectangle(String color, double topLeftX,double topLeftY, double bottomRightX,double bottomRightY, double xSpeed, double ySpeed) {
        super(color, (topLeftX - bottomRightX) * (topLeftY - bottomRightY));
        this.topLeft = new Point(topLeftX,topLeftY,xSpeed,ySpeed);
        this.bottomRight = new Point(bottomRightX,bottomRightY,xSpeed,ySpeed);
        rectangleCount++;
        rectanglesArea += this.getArea();
    }

    @Override
    public void move(String side) {
        this.topLeft.move(side);
        this.bottomRight.move(side);
    }

    @Override
    public void resize(int percentage) {
        double ratio = (double) percentage / 100;

        double ratioForOnePoint = Math.sqrt(ratio);

        double distanceForOneSide = Math.abs(this.topLeft.getY() - this.bottomRight.getY());
        double distanceForOtherSide = Math.abs(this.topLeft.getX() - this.bottomRight.getX());

        double newDistanceForOneSide = distanceForOneSide * ratioForOnePoint;
        double newDistanceForOtherSide = distanceForOtherSide * ratioForOnePoint;

        this.topLeft.setY(this.topLeft.getY() - ((distanceForOneSide - newDistanceForOneSide)/2));
        this.topLeft.setX(this.topLeft.getX() + ((distanceForOtherSide - newDistanceForOtherSide)/2));

        this.bottomRight.setY(this.bottomRight.getY() + ((distanceForOneSide - newDistanceForOneSide)/2));
        this.bottomRight.setX(this.bottomRight.getX() - ((distanceForOtherSide - newDistanceForOtherSide)/2));
    }

    @Override
    public double getArea() {
        return Math.abs((this.topLeft.getX() - this.bottomRight.getX()) * (this.topLeft.getY() - this.bottomRight.getY()));
    }

    @Override
    public String toString() {
        double area = this.getArea();
        area = area * 100;
        int areaInt = (int) area;
        area = (double) areaInt / 100;

        return "Rectangle:\n ID: " + super.getId() + "\n Color: " + super.getColor() + "\n Created Date: " +
                super.getCreatedDate() + "\n Top Left: (" + this.topLeft.getX() + "," + this.topLeft.getY() +
                ")\n Bottom Right: ("+this.bottomRight.getX() + "," + this.bottomRight.getY() +
                ")\n Rectangle Count: " + rectangleCount + "\n Area: " + area + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Rectangle){
            Rectangle otherRectangle = (Rectangle) obj;
            return this.getId() == otherRectangle.getId();
        }
        return false;
    }
}
