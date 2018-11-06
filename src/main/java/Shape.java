public abstract class Shape {
    abstract double area();
    abstract double perimeter();

    protected static int compareHelp(double gap) {
        if (gap < 0) {
            return -1;
        } else if (gap > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
