package com.company;

public class Secant {

    public Cosinus cos;

    public Secant(Cosinus cos){
        this.cos = cos;
    }

    public double sec(double x){
        return 1/cos.cos(x);
    }
}
