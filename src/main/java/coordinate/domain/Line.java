package coordinate.domain;

import java.util.List;

public class Line extends AbstractFigure {
    public static final int LINE_POINT_SIZE = 2;

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double getAreaInfo() {
        return 0;
    }
}
