package ch.bztf;

public class Zylinderber {

    public double zylinderVolumen(double radius, double hoehe) {

        return Math.PI * radius * radius * hoehe;
    }

    public double zylinderOberflaeche( double radius, double hoehe){
	 
	    return  2 * Math.PI * radius * (radius+hoehe);
    }
}
