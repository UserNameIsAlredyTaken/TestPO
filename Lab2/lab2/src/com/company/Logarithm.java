package com.company;

public class Logarithm {

    public double log(double value, double base){
        return ln(value) / ln(base);
    }

    public double ln(double x){
        double y = (x - 1) / (x + 1);

        double sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += element(y, i);
        }

        return 2 * sum;
    }

    public double element(double x, int power){
        return pow(x, 1 + 2 * power)/1 + 2 * power;
    }

    public class NegativePowException extends RuntimeException {}

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
