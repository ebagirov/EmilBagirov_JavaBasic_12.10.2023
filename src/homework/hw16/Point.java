package homework.hw16;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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

    public int distanceToPoint(Point point) {
        return Point.distanceBetweenPoints(this, point);
    }

    public static int distanceBetweenPoints(Point from, Point to) {
        if (from == null || to == null) {
            return -1;
        }
        if(from == to) {
            return 0;
        }
        return Math.abs(Math.min(from.x - to.x, 2) + Math.min(from.y - to.y, 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}