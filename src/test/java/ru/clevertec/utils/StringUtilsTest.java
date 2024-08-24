package ru.clevertec.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class StringUtilsTest {

    @Test
    public void testIsPositiveNumber() {
        assertFalse(StringUtils.isPositiveNumber(null));
        assertFalse(StringUtils.isPositiveNumber(""));
        assertFalse(StringUtils.isPositiveNumber("abc"));
        assertFalse(StringUtils.isPositiveNumber("-10"));
        assertTrue(StringUtils.isPositiveNumber("10"));
        assertFalse(StringUtils.isPositiveNumber("0"));
    }

}