package com.company;

import sun.awt.geom.AreaOp;

import java.util.Dictionary;

public class Main {

    public static void main(String[] args) {
        Sinus sinus = new Sinus();
        Cosinus cosinus = new Cosinus(sinus);
	    Cotangent cotangent = new Cotangent(cosinus, sinus);
	    Secant secant = new Secant(cosinus);
	    Cosecant cosecant = new Cosecant(sinus);

	    NaturalLogarithm naturalLogarithm = new NaturalLogarithm();
	    Logarithm logarithm = new Logarithm(naturalLogarithm);

	    System system = new System(sinus,cosinus,cosecant,cotangent, secant, logarithm, naturalLogarithm);

        double start = -10;
        double finish = 10;
        double step = 0.2;

//        Dictionary<double, double>
//
//        for(;start < finish; start += step){
//
//        }



    }
}
