package homework.hw16;

public class PointRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point firstPoint = new Point(20, 120);
        Point secondPoint = new Point(0, 50);

        System.out.println("\n\t" + "Coordinates of points" + "\t");
        System.out.println("The first: " + firstPoint);
        System.out.println("The second point: " + secondPoint);

        System.out.println("\n" + "Distance from the first point to the second point: " + firstPoint.distanceToPoint(secondPoint));
        System.out.println("Distance between the first point and the second point: " + Point.distanceBetweenPoints(firstPoint, secondPoint));

        System.out.println("\n\t" + "Updated points coordinates" + "\t");
        firstPoint.setX(0);
        firstPoint.setY(15);
        secondPoint.setX(20);
        secondPoint.setY(30);

        System.out.println("The first: " + firstPoint);
        System.out.println("The second: " + secondPoint);

        System.out.println("\n\t" + "Cloned first point" + "\t");
        Point clonedPoint = (Point) firstPoint.clone();
        System.out.println("Cloned point: " + clonedPoint);

        System.out.println("\n\t" + "Comparison of the first point with the cloned point" + "\t");
        System.out.println("cloned point == the first point: " + (clonedPoint == firstPoint) + " - objects are physically different in heap");
        System.out.println("cloned point EQUALS the first point: " + clonedPoint.equals(firstPoint) + " - parameters of the objects are equal");
    }
}