package fuel;

public abstract class Car {
    protected String name;
    protected int tripDistance;
    protected double distancePerLiter;

    public Car(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    public Car(int tripDistance, double distancePerLiter) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = distancePerLiter;
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    abstract double getTripDistance();

    /**
     * 차종의 이름
     */
    abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
     */
    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
