package coordinate.domain;

import java.util.Objects;

public class Point {
    public static final int MAX_VALUE = 24;
    public static final int MIN_VALUE = 0;
    private int x;
    private int y;



    public Point(int x, int y) {
        if (isNotValidateXY(x, y)) {
            throw new IllegalArgumentException("[범위 초과] " + MIN_VALUE + "~" + MAX_VALUE + " 범위여야 합니다.");
        }

        this.x = x;
        this.y = y;
    }

    public Point(String point) {
        String[] split = point.split(",");
        int x = Integer.parseInt(split[0].trim());
        int y = Integer.parseInt(split[1].trim());
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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
