
class Shape {

    public double width;
    public double length;
    private static String name;

    public Shape(double width, double length, String name) {
        this.width = width;
        this.length = length;
        Shape.name = name;
    }

    public void printName() {
        System.out.println("Shape Name: " + name);
    }
}

class Rectangle extends Shape {

    public Rectangle(double width, double length, String name) {
        super(width, length, name);
    }

    public double Area() {
        return width * length;
    }
}

public class Main {

    public static void main(String[] args) {

        Rectangle Rect = new Rectangle(7.0, 5.0, "Rectangle");

        System.out.println("Area of Rectangle: " + Rect.Area());

        Rect.printName();
    }
}
