package coordinate.domain;

import java.util.List;

public class Triangle extends AbstractFigure {
    public static final int TRIANGLE_POINT_SIZE = 3;

    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public double getAreaInfo() {
        return 0;
    }
}
