package coordinate.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FigureFactoryTest {

    private List<Point> points;
    @BeforeEach
    void setUp() {
        points = new ArrayList<>();
    }

    @Test
    void null_입력에_대한_예외처리() {
        assertThatThrownBy(() -> FigureFactory.create(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void Point_1개_입력에_대한_예외처리() {
        points.add(new Point(1, 2));
        assertThatThrownBy(() -> FigureFactory.create(points))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void Point_5개_입력에_대한_예외처리() {
        points.add(new Point(1, 2));
        points.add(new Point(3, 5));
        points.add(new Point(5, 6));
        points.add(new Point(7, 9));
        points.add(new Point(11, 13));
        assertThatThrownBy(() -> FigureFactory.create(points))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void Point가_2개일_경우_Line_생성() {
        points.add(new Point(1, 2));
        points.add(new Point(3, 4));
        assertThat(FigureFactory.create(points)).isEqualTo(new Line(points));
    }

    @Test
    void Point가_3개일_경우_Triangle_생성() {
        points.add(new Point(1, 2));
        points.add(new Point(3, 4));
        points.add(new Point(4, 7));
        assertThat(FigureFactory.create(points)).isEqualTo(new Triangle(points));
    }

    @Test
    void Point가_4개일_경우_Rectangle_생성() {
        points.add(new Point(1, 2));
        points.add(new Point(3, 4));
        points.add(new Point(1, 4));
        points.add(new Point(3, 2));
        assertThat(FigureFactory.create(points)).isEqualTo(new Rectangle(points));
    }

    @AfterEach
    void tearDown() {
        points = null;
    }
}