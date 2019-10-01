package com.company;

public class Sinus {
    public static double PI = 3.1415926535897932384626433832795;

    public int factorial(int index) {
        if (index < 0) {
            throw new NegativePowException();
        }

        int multiply = 1;
        for (int i = 1; i <= index; i++) {
            multiply *= i;
        }
        return multiply;
    }

    public double element(double x, int power) {
        return pow(-1, power) * pow(x, 2 * power + 1) / factorial(2 * power + 1);
    }

    public double sin(double x) {
        //double cpy_x = x % 6.283185307179586476925286766559;

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

        //x = x % 3.1415926535897932384626433832795;


        double sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += element(x, i);
        }

        /*
        if (cpy_x > 3.1415926535897932384626433832795) {
            sum *= -1;
        }
        */

        return sum;
    }

    public class NegativePowException extends RuntimeException {

    }

    public static void main(String [] args)
    {}

    /*
    public int sign_pow(int i) {
        if (i < 0) {
            throw new NegativePowException();
        }

        if (i % 2 == 0) {
            return 1;
        }
        return -1;
    }
    */

    public double pow(double x, int power) {
        if (power < 0) {
            throw new NegativePowException();
        }

        double multiply = 1;
        for (int i = 0; i < power; i++) {
            multiply *= x;
        }
        return multiply;
    }
}