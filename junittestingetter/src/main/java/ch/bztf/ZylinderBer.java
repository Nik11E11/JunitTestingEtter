package ch.bztf;

public class ZylinderBer {

    // Zylindervolumen berechnen
    public double zylinderVolumen(double radius, double hoehe) {

        return Math.PI * radius * radius * hoehe;
    }

    // Zylinderoberflaeche berechnen
    public double zylinderOberflaeche(double radius, double hoehe) {

        return 2 * Math.PI * radius * (radius + hoehe);
    }
}
