package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class UtilsTest {

    @Test
    public void whenAllPositiveNumbers() {
        String[] input = {"1", "2", "3", "4"};
        assertTrue(Utils.isAllPositiveNumbers(input));
    }

    @Test
    public void whenContainsNegativeNumber() {
        String[] input = {"1", "-2", "3", "4"};
        assertFalse(Utils.isAllPositiveNumbers(input));
    }

    @Test
    public void whenContainsZero() {
        String[] input = {"1", "0", "3", "4"};
        assertFalse(Utils.isAllPositiveNumbers(input));
    }

    @Test
    public void whenContainsNonNumericString() {
        String[] input = {"1", "two", "3", "4"};
        assertFalse(Utils.isAllPositiveNumbers(input));
    }

    @Test
    public void whenEmptyArray() {
        String[] input = {};
        assertTrue(Utils.isAllPositiveNumbers(input));
    }

    @Test
    public void whenContainsNull() {
        String[] input = {"1", null, "3", "4"};
        assertFalse(Utils.isAllPositiveNumbers(input));
    }

    @Test
    public void whenSinglePositiveNumber() {
        String[] input = {"52"};
        assertTrue(Utils.isAllPositiveNumbers(input));
    }

    @Test
    public void whenSingleNegativeNumber() {
        String[] input = {"-52"};
        assertFalse(Utils.isAllPositiveNumbers(input));
    }

}