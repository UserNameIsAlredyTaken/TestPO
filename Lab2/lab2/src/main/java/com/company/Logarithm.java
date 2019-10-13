package com.company;

public class Logarithm {
    NaturalLogarithm ln;

    public Logarithm(NaturalLogarithm ln){
        this.ln = ln;
    }

    public double log(double value, double base){
        return ln.ln(value) / ln.ln(base);
    }
}
