package com.company;

public class Cotangent {
    public Cosinus cos;
    public Sinus sin;

    public Cotangent(Cosinus cos, Sinus sin){
        this.cos = cos;
        this.sin = sin;
    }

    public double ctg(double x){
        return cos.cos(x)/sin.sin(x);
    }
}
