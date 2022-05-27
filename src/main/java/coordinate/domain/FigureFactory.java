package coordinate.domain;

import java.util.List;

public class FigureFactory {
    private static final String ERROR_INVALID_FIGURE_CREATION = "입력된 Point 개수가 유효하지 않습니다.";
    private static final int NUM_OF_VERTICES_OF_LINE = 2;
    private static final int NUM_OF_VERTICES_OF_TRIANGLE = 3;
    private static final int NUM_OF_VERTICES_OF_RECTANGLE = 4;

    public static Figure create(List<Point> points) {
        if (points == null) {
            throw new IllegalArgumentException(AbstractFigure.ERROR_FIGURE_NULL);
        }

        if (points.size() == NUM_OF_VERTICES_OF_LINE) {
            return new Line(points);
        }

        if (points.size() == NUM_OF_VERTICES_OF_TRIANGLE) {
            return new Triangle(points);
        }

        if (points.size() == NUM_OF_VERTICES_OF_RECTANGLE) {
            return new Rectangle(points);
        }

        throw new IllegalArgumentException("유효하지 않은 도형입니다.");
    }
}
