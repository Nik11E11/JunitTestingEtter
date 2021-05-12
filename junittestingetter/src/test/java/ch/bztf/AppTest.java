package ch.bztf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    // Zylinderoberflaeche testen
    public void testZylinderOberflaeche() {
        ZylinderBer zylinderOberflaeche = new ZylinderBer();
        double exp = 131.94689145077132;
        double act = zylinderOberflaeche.zylinderOberflaeche(3, 4);
        assertEquals(exp, act, "Rechnet die Oberflaeche von dem Zylinder");
    }

    @Test
    // Zylindervolumen testen
    public void testZylinderVolumen() {
        ZylinderBer zylinderVolumen = new ZylinderBer();
        double exp = 113.09733552923255;
        double act = zylinderVolumen.zylinderVolumen(3, 4);
        assertEquals(exp, act, "Rechnet das Volumen des Zylinders");
    }

    @Test
    // Pyramidenvolumen testen
    public void testPyramidenVolumen() {
        PyramideBer pyramidenVolumen = new PyramideBer();
        double exp = 42.666666666666664;
        double act = pyramidenVolumen.pyramideVolumen(4, 4, 8);
        assertEquals(exp, act, "Rechnet das Volumen von der Pyramide");
    }

    @Test
    // Kugeloberflaeche testen
    public void testKugelVolumen() {
        KugelBer kugelVolumen = new KugelBer();
        double exp = 523.5987755982857;
        double act = kugelVolumen.kugelVolumen(5);
        assertEquals(exp, act, "Rechnet dei Oberflaeche der Kugel");
    }

    @Test
    // Kugeloberflaeche testen
    public void testKugelOberflaeche() {
        KugelBer kugelOberflaeche = new KugelBer();
        double exp = 314.1592653589793;
        double act = kugelOberflaeche.kugelOberflaeche(5);
        assertEquals(exp, act, "Rechnet dei Oberflaeche der Kugel");
    }
}
