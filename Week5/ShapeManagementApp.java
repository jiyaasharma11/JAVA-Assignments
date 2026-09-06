abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    double area() { return Math.PI * r * r; }
}

class Rectangle extends Shape {
    double w, h;
    Rectangle(double w, double h) { this.w = w; this.h = h; }
    double area() { return w * h; }
}

public class ShapeManagementApp {
    public static void main(String[] args) {
        Shape[] arr = new Shape[2];
        arr[0] = new Circle(5.0);
        arr[1] = new Rectangle(4.0, 6.0);

        for (Shape s : arr) {
            System.out.println(s.area());
        }
    }
}