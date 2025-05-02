public class Point implements Moveable {
    private double x;
    private double y;

    private double xSpeed;
    private double ySpeed;

    Point(double x, double y, double xSpeed, double ySpeed) {
        this.x = x;
        this.y = y;

        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    @Override
    public void move(String side) {
        switch (side){
            case "up":
                this.y += this.ySpeed;
                break;
            case "down":
                this.y -= this.ySpeed;
                break;
            case "left":
                this.x -= this.xSpeed;
                break;
            case "right":
                this.x += this.xSpeed;
                break;
        }
    }

    // for resizing rectangle
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
