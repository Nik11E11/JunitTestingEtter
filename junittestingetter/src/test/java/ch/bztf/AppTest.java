package ch.bztf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test() {
        System.out.println("This test ran");
    }

    @Test
    public void testZylinderOberflaeche() {
        ZylinderBer zylinderOberflaeche = new ZylinderBer();
        double exp = 131.94689145077132;
        double act = zylinderOberflaeche.zylinderOberflaeche(3, 4);
        assertEquals(exp, act);
    }

    @Test
    public void testZylinderVolumen() {
        ZylinderBer zylinderVolumen = new ZylinderBer();
        double exp = 113.09733552923255;
        double act = zylinderVolumen.zylinderVolumen(3, 4);
        assertEquals(exp, act);
    }

    @Test
    public void testPyramidenVolumen() {
        PyramideBer pyramidenVolumen = new PyramideBer();
        double exp = 42.666666666666664;
        double act = pyramidenVolumen.pyramideVolumen(4, 4, 8);
        assertEquals(exp, act);
    }
}
