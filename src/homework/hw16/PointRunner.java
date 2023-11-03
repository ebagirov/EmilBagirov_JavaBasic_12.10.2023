package homework.hw16;

public class PointRunner {
    public static void main(String[] args) {
        Point firstPoint = new Point(5, 25);
        Point secondPoint = new Point(0, 15);

        System.out.println("The first point coordinates (x, y): " + firstPoint.getX() + ", " + firstPoint.getY());
        System.out.println("The second point coordinates (x, y): " + secondPoint.getX() + ", " + secondPoint.getY());

        System.out.println("Distance from the first point to the second point: " + firstPoint.distanceToPoint(secondPoint));
        System.out.println("Distance between the first point and the second point: " + Point.distanceBetweenPoints(firstPoint, secondPoint));

        System.out.println("\t" + "Updated points coordinates" + "\t");
        firstPoint.setX(-5);
        firstPoint.setY(15);
        secondPoint.setX(-20);
        secondPoint.setY(-10);
        System.out.println("The first point (x, y): " + firstPoint);
        System.out.println("The second point (x, y): " + secondPoint);
    }
}