package com.company;

//import com.opencsv.CSVWriter;
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

        String delimrter = ",";

        double current = -5;
        int finish = 5;
        float step = 0.2f;
        try {
            FileWriter csvWriter = new FileWriter("data.csv");
            csvWriter.append("Current_X");
            csvWriter.append(delimrter);
            csvWriter.append("System_result");
            csvWriter.append(delimrter);
            csvWriter.append("Sin");
            csvWriter.append(delimrter);
            csvWriter.append("Cos");
            csvWriter.append(delimrter);
            csvWriter.append("Ctg");
            csvWriter.append(delimrter);
            csvWriter.append("Sec");
            csvWriter.append(delimrter);
            csvWriter.append("Csc");
            csvWriter.append(delimrter);
            csvWriter.append("Ln");
            csvWriter.append(delimrter);
            csvWriter.append("Log");
            csvWriter.append("\n");

            for(;current < finish; current += step){

                csvWriter.append(Double.toString(current));
                csvWriter.append(delimrter);
                csvWriter.append(Double.toString(system.SysResult(current)));
                csvWriter.append(delimrter);
                csvWriter.append(Double.toString(sinus.sin(current)));
                csvWriter.append(delimrter);
                csvWriter.append(Double.toString(cosinus.cos(current)));
                csvWriter.append(delimrter);
                csvWriter.append(Double.toString(cotangent.ctg(current)));
                csvWriter.append(delimrter);
                csvWriter.append(Double.toString(secant.sec(current)));
                csvWriter.append(delimrter);
                csvWriter.append(Double.toString(cosecant.cosec(current)));
                csvWriter.append(delimrter);
                csvWriter.append(Double.toString(naturalLogarithm.ln(current)));
                csvWriter.append(delimrter);
                csvWriter.append(Double.toString(logarithm.log(current, 2)));
                csvWriter.append("\n");
            }

            csvWriter.flush();
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
