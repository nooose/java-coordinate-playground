package fuel;

public class Avante extends Car {

    public Avante(int tripDistance) {
        super(tripDistance, 15);
        this.name = "Avante";
    }

    @Override
    double getDistancePerLiter() {return this.distancePerLiter;
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
