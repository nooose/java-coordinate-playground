package fuel;

import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    private final Cars cars;

    public RentCompany(Cars cars) {
        this.cars = cars;
    }

    public static RentCompany create() {
        return new RentCompany(new Cars());
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        List<Car> carList = cars.getCars();

        for (Car car : carList) {
            sb.append(car.getName() + " : " + (int) car.getChargeQuantity() + "리터" + NEWLINE);
        }

        return sb.toString();
    }
}
