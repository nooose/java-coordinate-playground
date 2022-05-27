package coordinate.domain;

import java.util.Objects;

public class Point {
    public static final int MAX_VALUE = 24;
    public static final int MIN_VALUE = 0;
    private final int x;
    private final int y;


    public Point(int x, int y) {
        if (isNotValidateXY(x, y)) {
            throw new IllegalArgumentException("[범위 초과] " + MIN_VALUE + "~" + MAX_VALUE + " 범위여야 합니다.");
        }

        this.x = x;
        this.y = y;
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

    private boolean isNotValidateXY(int x, int y) {
        return isGreaterThanMaxValue(x, y) || isLessThanMinValue(x, y);
    }

    private boolean isGreaterThanMaxValue(int x, int y) {
        return x > MAX_VALUE || y > MAX_VALUE;
    }

    private boolean isLessThanMinValue(int x, int y) {
        return x < MIN_VALUE || y < MIN_VALUE;
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
