package com.company;

public class Cosinus {
    public static double PI = 3.1415926535897932384626433832795;

    public double cos(double x){
        x = x<0 ? -1*x : x;
        x %= PI;

        Sinus sinus = new Sinus();
        if(PI/2 < x && x < PI * 3/2){
            return Math.sqrt(1 - sinus.pow(sinus.sin(x), 2)) * -1;
        }else{
            return Math.sqrt(1 - sinus.pow(sinus.sin(x), 2));
        }
    }
}
