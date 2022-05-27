package coordinate.domain;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Rectangle extends AbstractFigure {
    private static final String ERROR_INVALID_RECTANGLE = "직사각형 모양이 아닙니다.";
    private static final String OUTPUT_AREA_OF_RECTANGLE = "사각형의 넓이는 ";
    private static final int NUM_OF_TYPES_OF_RECTANGLE_COORDINATES = 2;

    public Rectangle(List<Point> points) {
        super(points);
        checkRectangleWith(points);
    }

    private void checkRectangleWith(List<Point> points) {
        Set<Integer> xValuesOfPoints = convertToUniqueXValues(points);
        Set<Integer> yValuesOfPoints = convertToUniqueYValues(points);

        if (hasNotTwoPoints(xValuesOfPoints) || hasNotTwoPoints(yValuesOfPoints)) {
            throw new IllegalArgumentException(ERROR_INVALID_RECTANGLE);
        }
    }

    private Set<Integer> convertToUniqueXValues(List<Point> points) {
        return convertToUniqueValues(points, Point::getX);
    }

    private Set<Integer> convertToUniqueYValues(List<Point> points) {
        return convertToUniqueValues(points, Point::getY);
    }

    private Set<Integer> convertToUniqueValues(List<Point> points, Function<Point, Integer> function) {
        return points.stream()
                .map(function)
                .collect(toSet());
    }

    private boolean hasNotTwoPoints(Set<Integer> valuesOfPoints) {
        return valuesOfPoints.size() != NUM_OF_TYPES_OF_RECTANGLE_COORDINATES;
    }


    @Override
    public double getAreaInfo() {
        return 0;
    }
}