package ru.clevertec.utils;


public class StringUtils {

    public static boolean isPositiveNumber(String str) {

        if (str == null) {
            System.err.println("String is null");
            return false;
        }

        if (str.isEmpty()) {
            System.err.println("String is empty");
            return false;
        }

        try {
            var result = Integer.parseInt(str);
            return result > 0;
        } catch (NumberFormatException e) {
            System.err.printf("%s is not a valid number\n", str);
            return false;
        }
    }

}
