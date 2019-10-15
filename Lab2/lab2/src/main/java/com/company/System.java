package com.company;

public class System {
    Sinus sin;
    Cosinus cos;
    Cosecant cosecant;
    Cotangent cotangent;
    Secant secant;

    Logarithm log;
    NaturalLogarithm ln;

    public System(Sinus sin,
            Cosinus cos,
            Cosecant cosecant,
            Cotangent cotangent,
            Secant secant,
            Logarithm log,
            NaturalLogarithm ln){
        this.sin = sin;
        this.cos = cos;
        this.cosecant = cosecant;
        this.cotangent = cotangent;
        this.secant = secant;
        this.log = log;
        this.ln = ln;
    }

    public double SysResult(double x){
        if(x <= 0){
            return Math.pow(((cotangent.ctg(x) + secant.sec(x)) / secant.sec(x) - secant.sec(x)) *
                    (Math.pow(sin.sin(x),3) + secant.sec(x) + sin.sin(x) + cosecant.cosec(x)), 3);
        }else{
            return Math.pow(Math.pow(log.log(x, 5),2), 2) - log.log(x, 2) - log.log(x, 2) +
                    Math.pow(log.log(x, 5), 3) / (ln.ln(x) / (Math.pow(log.log(x, 2), 3) + (log.log(x, 10) - log.log(x, 5))));
        }
    }

}
