package fuel;

public class Sonata extends Car {
    public Sonata(int tripDistance) {
        super(tripDistance, 10);
        this.name = "Sonata";
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
