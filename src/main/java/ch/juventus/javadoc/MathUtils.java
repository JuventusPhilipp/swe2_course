package ch.juventus.javadoc;

import java.util.List;

/**
 * This class provides some basic math funtions
 *
 * @author  Philipp
 * @version 0.1
 * @since   2020-09-03
 */

public class MathUtils {

    /**
     * Add a list of numbers together
     * @param numbers the list of numbers to add together
     * @return sum of numbers
     */
    public double addition(List<Double> numbers) {
        double sum = 0;
        for (Double number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * Subtract a number from another number
     * @param a the number to subtract from
     * @param b the number to subtract
     * @return difference of the given numbers
     */
    public double subtraction(double a, double b) {
        return a - b;
    }

    /**
     * Divide the two given numbers
     * @param a the number to divide
     * @param b the number to divide by
     * @return the result of the division
     */
    public double division(double a, double b) {
        return a / b;
    }

    /**
     * Multiply the two given numbers
     * @param a the number to multiply
     * @param b the number to multiply by
     * @return the result of the multiplication
     */
    public double multiplication(double a, double b) {
        return a * b;
    }
}
