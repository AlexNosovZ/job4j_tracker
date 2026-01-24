package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {

    @Test
    public void when3And0And0And4Then5() {
        Point p1 = new Point(3, 0);
        Point p2 = new Point(0, 4);
        Double expected = 5.0;
        Double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when2And10And0And0And0And11Then15() {
        Point p1 = new Point(2, 10, 0);
        Point p2 = new Point(0, 0, 11);
        Double expected = 15.0;
        Double output = p1.distance3d(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when1And2And3And3And5And9Then7() {
        Point p1 = new Point(1, 2, 3);
        Point p2 = new Point(3, 5, 9);
        Double expected = 7.0;
        Double output = p1.distance3d(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}