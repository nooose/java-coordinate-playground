package fuel;

public class K5 extends Car {
    public K5(int tripDistance) {
        super(tripDistance, 13);
        this.name = "K5";
    }

    @Override
    double getDistancePerLiter() {
        return this.distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    String getName() {
        return this.name;
    }
}
