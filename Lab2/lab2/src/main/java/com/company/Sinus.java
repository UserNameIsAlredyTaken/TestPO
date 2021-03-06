package com.company;

import java.math.BigDecimal;
import java.math.MathContext;

public class Sinus {
    public static double PI = 3.1415926535897932384626433832795;

    public BigDecimal factorial(int index) {
        if (index < 0) {
            throw new NegativePowException();
        }

        BigDecimal multiply = new BigDecimal(1);
        for (int i = 1; i <= index; i++) {
            multiply = multiply.multiply(new BigDecimal(i));
        }
        return multiply;
    }

    public BigDecimal element(BigDecimal x, int power) {
        return pow(new BigDecimal(-1), power).multiply(pow(x, 2 * power + 1)).divide(factorial(2 * power + 1), MathContext.DECIMAL128);
    }

    public double sin(double x) {
        x = x % 6.283185307179586476925286766559;

        if (x < 0) {
            x = 6.283185307179586476925286766559 + x;
        }

        if (x >= 3.1415926535897932384626433832795) {
            x = x - 6.283185307179586476925286766559;
        }

        if (x > 1.5707963267948966192313216916398) {
            x = 3.1415926535897932384626433832795 - x;
        }

        if (x < -1.5707963267948966192313216916398) {
            x = -3.1415926535897932384626433832795 - x;
        }

        BigDecimal big_x = new BigDecimal(x);

        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < 15; i++) {
            sum = sum.add(element(big_x, i));
        }

        return sum.doubleValue();
    }

    public class NegativePowException extends RuntimeException {}

    public BigDecimal pow(BigDecimal x, int power) {
        if (power < 0) {
            throw new NegativePowException();
        }

        BigDecimal multiply = new BigDecimal(1);
        for (int i = 0; i < power; i++) {
            multiply = multiply.multiply(x);
        }
        return multiply;
    }
}