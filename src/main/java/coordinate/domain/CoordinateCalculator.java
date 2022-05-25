package coordinate.domain;

public class CoordinateCalculator implements Calculator {
    @Override
    public double getDistance(Point pointA, Point pointB) {
        double a = (double) pointA.getX() - (double) pointB.getX();
        double b = (double) pointA.getY() - (double) pointB.getY();

        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
