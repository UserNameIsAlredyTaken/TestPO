package com.company;

public class Cosinus {
    public static double PI = 3.1415926535897932384626433832795;
    public Sinus sin;

    public Cosinus(Sinus sin){
        this.sin = sin;
    }

    public double cos(double x){
        x = x<0 ? -1*x : x;
        x %= 2 * PI;

        if(PI/2 < x && x < PI * 3/2){
            return Math.sqrt(1 - sin.pow(sin.sin(x), 2)) * -1;
        }else{
            return Math.sqrt(1 - sin.pow(sin.sin(x), 2));
        }
    }
}
