package constructor.point;

public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    protected double distance(){
        int x = 0;
        int y = 0;
        return distance(x,y);
    }
    protected double distance(int x, int y){
        double distance =((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y));
        return Math.sqrt(distance);
    }
    protected double distance(Point anotherPoint){
        int x = anotherPoint.getX();
        int y = anotherPoint.getY();
        return distance(x,y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
