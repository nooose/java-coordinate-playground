package coordinate.domain;

import java.util.Objects;

public class Point {
    private static final String ERROR_OUT_OF_POINT_RANGE
            = "잘못된 범위의 입력값입니다. 정수 범위는 " + Point.LOWER_LIMIT + " ~ " + Point.UPPER_LIMIT + " 사이의 수로 입력해주세요.";
    public static final int UPPER_LIMIT = 24;
    public static final int LOWER_LIMIT = 0;
    private final int x;
    private final int y;


    public Point(int x, int y) {
        checkRangeOf(x, y);

        this.x = x;
        this.y = y;
    }

    private void checkRangeOf(int x, int y) {
        if (exceedRange(x) || exceedRange(y)) {
            throw new IllegalArgumentException(ERROR_OUT_OF_POINT_RANGE);
        }
    }

    private boolean exceedRange(int coordinate) {
        return coordinate < LOWER_LIMIT || coordinate > UPPER_LIMIT;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistance(Point other) {
        int xDifference = other.minusX(x);
        int yDifference = other.minusY(y);
        return Math.sqrt(square(xDifference) + square(yDifference));
    }

    private int minusX(int number) {
        return this.x - number;
    }

    private int minusY(int number) {
        return this.y - number;
    }

    private static int square(int number) {
        return number * number;
    }



    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public static Point ofCommaSeparator(String text) {
        String[] values = text.split(",");
        int x = Integer.parseInt(values[0].trim());
        int y = Integer.parseInt(values[1].trim());
        return new Point(x, y);
    }

    public boolean isSame(int x, int y) {
        return this.x == x && this.y == y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
