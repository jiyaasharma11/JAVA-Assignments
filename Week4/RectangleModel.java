class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1, 1);
        System.out.println("No-argument constructor");
    }

    public Rectangle(double size) {
        this(size, size);
        System.out.println("Square constructor");
    }

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive");
        }

        this.width = width;
        this.height = height;

        System.out.println("Two-argument constructor");
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }

    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Factor must be positive");
        }

        width *= factor;
        height *= factor;
    }

    public String toString() {
        return "Rectangle: " + width + " x " + height +
               ", Area=" + getArea() +
               ", Perimeter=" + getPerimeter();
    }
}

public class RectangleModel {
    public static void main(String[] args) {
        System.out.println("Rectangle 1:");
        Rectangle r1 = new Rectangle();

        System.out.println("\nRectangle 2:");
        Rectangle r2 = new Rectangle(5);

        System.out.println("\nRectangle 3:");
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("r2 is square: " + r2.isSquare());

        r3.scale(2);
        System.out.println("After scaling: " + r3);
    }
}