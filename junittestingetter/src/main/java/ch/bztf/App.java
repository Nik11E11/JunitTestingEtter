package ch.bztf;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // Formen erstellen
        ZylinderBer zylinderVolumen = new ZylinderBer();
        ZylinderBer zylinderOberflaeche = new ZylinderBer();

        PyramideBer pyramideVolumen = new PyramideBer();

        KugelBer kugelVolumen = new KugelBer();
        KugelBer kugelOberflaeche = new KugelBer();

        // Ausgabe
        System.out.println("Zylindervolumen: " + zylinderVolumen.zylinderVolumen(3, 4));
        System.out.println("ZylinderOberflaeche: " + zylinderOberflaeche.zylinderOberflaeche(3, 4));
        System.out.println("Pyramidenvolumen: " + pyramideVolumen.pyramideVolumen(4, 4, 8));
        System.out.println("Kugelvolumen: " + kugelVolumen.kugelVolumen(5));
        System.out.println("Kugeloberflaeche: " + kugelOberflaeche.kugelOberflaeche(5));
    }
}
