package ch.juventus.javadoc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    private void setup(){
        mathUtils = new MathUtils();
    }

    @Test
    void twoPlusTwoShouldEqualsFour() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(2d);
        numbers.add(2d);
        assertEquals(4, mathUtils.addition(numbers), "Calculation result wrong");
    }

    @Test
    void testAdditionWithTreeEntryList() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(2.1d);
        numbers.add(3.0d);
        numbers.add(2.2d);
        assertEquals(7.3, mathUtils.addition(numbers), "Calculation result wrong");
    }

    @Test
    void testAdditionWithEmptyList() {
        List<Double> numbers = new ArrayList<>();
        assertEquals(0, mathUtils.addition(numbers));
    }

    @Test
    void shouldThrowExceptionWhenInputIsNull() {
        assertThrows(NullPointerException.class, () -> this.mathUtils.addition(null));
    }
}