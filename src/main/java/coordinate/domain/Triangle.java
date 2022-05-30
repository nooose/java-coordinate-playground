package coordinate.domain;

import java.util.List;

public class Triangle extends AbstractFigure {
    private static final String ERROR_INVALID_TRIANGLE = "삼각형 모양이 아닙니다.";
    private static final String OUTPUT_AREA_OF_TRIANGLE = "삼각형의 넓이는 ";

    public Triangle(List<Point> points) {
        super(points);
        if (isInStraightLine(points)) {
            throw new IllegalArgumentException(ERROR_INVALID_TRIANGLE);
        }
    }

    private boolean isInStraightLine(List<Point> points) {
        return points.get(0).calculateSlope(points.get(1)) == points.get(0).calculateSlope(points.get(2));
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String getAreaInfo() {
        return "";
    }
}
