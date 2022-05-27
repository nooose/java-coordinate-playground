package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointTest {

    @Test
    void 생성() {
        Point pointA = Point.ofCommaSeparator("24, 24");
        Point pointB = Point.ofCommaSeparator("24, 24");

        assertThat(pointA).isEqualTo(pointB);
    }

    @Test
    void 생성_검증() {
        assertThatThrownBy(() -> Point.ofCommaSeparator("15, 25")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> Point.ofCommaSeparator("25, 10")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> Point.ofCommaSeparator("25, 25")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> Point.ofCommaSeparator("-10, 10")).isInstanceOf(IllegalArgumentException.class);
    }
}
