package ch.bztf;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ZylinderBer zylinderVolumen = new ZylinderBer();
        ZylinderBer zylinderOberflaeche = new ZylinderBer();
        PyramideBer pyramideVolumen = new PyramideBer();

        System.out.println("Zylindervolumen: " + zylinderVolumen.zylinderVolumen(3, 4));
        System.out.println("ZylinderOberflaeche: " + zylinderOberflaeche.zylinderOberflaeche(3, 4));
        System.out.println("Pyramidenvolumen: " + pyramideVolumen.pyramideVolumen(4, 4, 8));
    }
}
