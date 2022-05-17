package Homework.Work6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class HSB_Test {
    GeomShape geomShape;

    @Test
    void testConstructor() {
        assertThrows(IllegalArgumentException.class, () ->
        {
            Color color = new HSB(-1, -2, -3);
            geomShape = new GeomShape(color);
            geomShape.setColor(color);
        });
    }

    @ParameterizedTest
    @CsvSource({"-1,2,3", "1,-1,3", "1,2,-1", "366,2,3", "1,258,3", "1,2,259"})
    void testConstructorColorThrows(int color1, int color2, int color3) {
        assertThrows(IllegalArgumentException.class, () -> {
            Color color = new HSB(color1, color2, color3);
            geomShape = new GeomShape(color);
            geomShape.setColor(color);
        });
    }
}
