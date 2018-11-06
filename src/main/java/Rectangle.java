public class Rectangle extends Shape implements Comparable<Rectangle> {
    private int Width;
    private int Length;

    Rectangle(int a, int b) {
        Width = a;
        Length = b;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }


    @Override
    double area() {
        return Width * Length;
    }

    @Override
    double perimeter() {
        return 2 * (Width + Length);
    }

    @Override
    public int compareTo(Rectangle other) {
        double gap = area() - other.area();
        return compareHelp(gap);
    }
}
