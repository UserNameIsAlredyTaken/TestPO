package com.company;

import com.opencsv.CSVWriter;
import sun.awt.geom.AreaOp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

        String csv = "data.csv";

        double current = -10;
        double finish = 10;
        double step = 0.2;
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(csv));

            for(;current < finish; current += step){
                ArrayList<String> csvLine = new ArrayList<String>();

                csvLine.add(Double.toString(current));
                csvLine.add(Double.toString(sinus.sin(current)));
                csvLine.add(Double.toString(cosinus.cos(current)));
                csvLine.add(Double.toString(cotangent.ctg(current)));
                csvLine.add(Double.toString(secant.sec(current)));
                csvLine.add(Double.toString(cosecant.cosec(current)));
                csvLine.add(Double.toString(naturalLogarithm.ln(current)));
                csvLine.add(Double.toString(logarithm.log(current, 2)));

                writer.writeNext(csvLine.toArray(new String[csvLine.size()]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
