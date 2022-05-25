package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointTest {

    @Test
    void 생성() {
        Point pointA = new Point("24, 24");
        Point pointB = new Point("24, 24");

        assertThat(pointA).isEqualTo(pointB);
    }

    @Test
    void 생성_검증() {
        assertThatThrownBy(() -> new Point("10, 25")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Point("25, 10")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Point("25, 25")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Point("-1, 10")).isInstanceOf(IllegalArgumentException.class);
    }
}
