package abstractclass.gamecharacter;

public final class Point {
    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long getDistance(Point otherPoint) {
        return (long)Math.sqrt((otherPoint.getX() - x) * (otherPoint.getX() - x) + (otherPoint.getY() - y) * (otherPoint.getY() - y));
    }
}
