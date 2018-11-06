import java.util.Comparator;

public class Cuboid extends Rectangle {
    private int Depth;

    Cuboid(int a, int b, int c) {
        super(a, b);
        Depth = c;
    }

    public int getDepth() {
        return Depth;
    }

    public void setDepth(int depth) {
        Depth = depth;
    }

    public double volume() {
        return super.area() * Depth;
    }

    @Override
    double area() {
        double down = super.area();
        double front = Depth * getWidth();
        double left = Depth * getLength();
        return 2 * (down + front + left);
    }

    @Override
    double perimeter() {
        throw new UnsupportedOperationException();
    }
}

class SortByArea implements Comparator<Cuboid> {
    @Override
    public int compare(Cuboid o1, Cuboid o2) {
        return o1.compareTo(o2);
    }
}

class SortByVolumn implements Comparator<Cuboid> {
    @Override
    public int compare(Cuboid o1, Cuboid o2) {
        double gap = o1.volume() - o2.volume();
        return Shape.compareHelp(gap);
    }
}
