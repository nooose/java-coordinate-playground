package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateCalculatorTest {

    @Test
    void 좌표_거리() {
        CoordinateCalculator calculator = new CoordinateCalculator();

        double distance = calculator.getDistance(new Point("10, 10"), new Point("14, 15"));
        Assertions.assertThat(distance).isEqualTo(6.403124, Offset.offset(0.001));
    }

    void 거리() {
        CoordinateCalculator calculator = new CoordinateCalculator();

        double distance = calculator.getDistance(new Point("10, 10"), new Point("14, 15"));
        Assertions.assertThat(distance).isEqualTo(6.403124, Offset.offset(0.001));
    }

}