package coordinate.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RectangleTest {
    private List<Point> points;
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        /**
         *      (1, 15)     (3, 15)
         *
         *        .            .
         *        .            .
         *        .            .
         *
         *      (1, 1)      (3, 1)
         */
        points = Arrays.asList(new Point(1, 1), new Point(1, 15)
                , new Point(3, 1), new Point(3, 15));
        rectangle = new Rectangle(points);
    }

    @Test
    void 직사각형_생성() {
        assertThat(rectangle).isEqualTo(new Rectangle(points));
    }

    @Test
    void 직사각형_생성_오류() {
        /**
         *                  (3, 5)
         *
         *      (1, 3)
         *
         *      (1, 1)      (3, 1)
         */

        List<Point> illegalPoints = Arrays.asList(new Point(1, 1), new Point(1, 3)
                , new Point(3, 1), new Point(3, 5));

        assertThatThrownBy(() -> new Rectangle(illegalPoints))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 직사각형_넓이() {
        assertThat(rectangle.area()).isEqualTo((double) 28);
    }

}