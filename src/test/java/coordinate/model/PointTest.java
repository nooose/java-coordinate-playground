package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointTest {

    @Test
    void 포인트_생성() {
        assertThat(new Point(1, 2)).isEqualTo(new Point(1, 2));
    }

    @Test
    void 좌표의_범위를_넘어가는_값이_생성자에_입력되었을_경우() {
        assertThatThrownBy(() -> new Point(-1, 0))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Point(0, -1))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Point(25, 0))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Point(0, 25))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 주어진_좌표와_포인트를_비교() {
        assertThat(new Point(1, 2).isSame(1, 2)).isTrue();
        assertThat(new Point(1, 2).isSame(1, 3)).isFalse();
    }
}
