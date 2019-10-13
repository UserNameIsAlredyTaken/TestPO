package com.company;

public class Cosecant {
    public Sinus sin;

    public Cosecant(Sinus sin){
        this.sin = sin;
    }

    public double cosec(double x){
        return 1/sin.sin(x);
    }
}
