package homework.hw3;

/*
Homework 3
Parallelepiped
 */
public class Parallelepiped {
    public static void main(String[] args) {
        byte length = 30;
        byte width = 20;
        byte height = 10;
        int volume = length * width * height;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        int perimeter = 4 * (length + width + height);
        System.out.println("Довжина всіх сторін паралелепіпеда = " + perimeter);
    }
}