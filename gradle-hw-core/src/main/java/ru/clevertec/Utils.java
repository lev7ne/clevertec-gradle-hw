package ru.clevertec;

import ru.clevertec.utils.StringUtils;

import java.util.Arrays;


public class Utils {

    public static boolean isAllPositiveNumbers(String... strings) {
        return Arrays.stream(strings)
                .allMatch(StringUtils::isPositiveNumber);
    }

}