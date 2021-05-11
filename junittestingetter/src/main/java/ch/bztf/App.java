package ch.bztf;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        Zylinderber zylinderVolumen = new Zylinderber();
        Zylinderber zylinderOberflaeche = new Zylinderber();


        System.out.println("Zylindervolumen: " + zylinderVolumen.zylinderVolumen(3, 4));
        System.out.println("ZylinderOberflaeche: " + zylinderOberflaeche.zylinderOberflaeche(3, 4));
    }
}
