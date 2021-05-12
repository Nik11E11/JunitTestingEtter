package ch.bztf;

public class KugelBer {

    // Kugelvolumen berechnen
    public double kugelVolumen(double radius) {

        return Math.PI * (radius * radius * radius) * 1.3333333333333;
    }

    // Kugeloberflaeche brechnen
    public double kugelOberflaeche(double radius) {

        return 4 * Math.PI * (radius * radius);
    }
}
