import com.company.*;
import com.company.System;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class AllMockTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new System(TestUtil.create_sinus_mock(),
                        TestUtil.create_cosinus_mock(),
                        TestUtil.create_cosecant_mock(),
                        TestUtil.create_cotangent_mock(),
                        TestUtil.create_secant_mock(),
                        TestUtil.create_logarithm_mock(),
                        TestUtil.create_natural_logarithm_mock())},
                {new System(new Sinus(),
                        TestUtil.create_cosinus_mock(),
                        TestUtil.create_cosecant_mock(),
                        TestUtil.create_cotangent_mock(),
                        TestUtil.create_secant_mock(),
                        TestUtil.create_logarithm_mock(),
                        TestUtil.create_natural_logarithm_mock())},
                {new System(TestUtil.create_sinus_mock(),
                        new Cosinus(TestUtil.create_sinus_mock()),
                        TestUtil.create_cosecant_mock(),
                        TestUtil.create_cotangent_mock(),
                        TestUtil.create_secant_mock(),
                        TestUtil.create_logarithm_mock(),
                        TestUtil.create_natural_logarithm_mock())},
                {new System(TestUtil.create_sinus_mock(),
                        TestUtil.create_cosinus_mock(),
                        new Cosecant(TestUtil.create_sinus_mock()),
                        TestUtil.create_cotangent_mock(),
                        TestUtil.create_secant_mock(),
                        TestUtil.create_logarithm_mock(),
                        TestUtil.create_natural_logarithm_mock())},
                {new System(TestUtil.create_sinus_mock(),
                        TestUtil.create_cosinus_mock(),
                        TestUtil.create_cosecant_mock(),
                        new Cotangent(TestUtil.create_cosinus_mock(), TestUtil.create_sinus_mock()),
                        TestUtil.create_secant_mock(),
                        TestUtil.create_logarithm_mock(),
                        TestUtil.create_natural_logarithm_mock())},
                {new System(TestUtil.create_sinus_mock(),
                        TestUtil.create_cosinus_mock(),
                        TestUtil.create_cosecant_mock(),
                        TestUtil.create_cotangent_mock(),
                        new Secant(TestUtil.create_cosinus_mock()),
                        TestUtil.create_logarithm_mock(),
                        TestUtil.create_natural_logarithm_mock())},
                {new System(TestUtil.create_sinus_mock(),
                        TestUtil.create_cosinus_mock(),
                        TestUtil.create_cosecant_mock(),
                        TestUtil.create_cotangent_mock(),
                        TestUtil.create_secant_mock(),
                        new Logarithm(TestUtil.create_natural_logarithm_mock()),
                        TestUtil.create_natural_logarithm_mock())},
                {new System(TestUtil.create_sinus_mock(),
                        TestUtil.create_cosinus_mock(),
                        TestUtil.create_cosecant_mock(),
                        TestUtil.create_cotangent_mock(),
                        TestUtil.create_secant_mock(),
                        TestUtil.create_logarithm_mock(),
                        new NaturalLogarithm())},

                //bottom-up integration
                {new System(TestUtil.create_sinus_mock(),
                        TestUtil.create_cosinus_mock(),
                        TestUtil.create_cosecant_mock(),
                        TestUtil.create_cotangent_mock(),
                        TestUtil.create_secant_mock(),
                        TestUtil.create_logarithm_mock(),
                        new NaturalLogarithm())},

                {new System(new Sinus(),
                        TestUtil.create_cosinus_mock(),
                        TestUtil.create_cosecant_mock(),
                        TestUtil.create_cotangent_mock(),
                        TestUtil.create_secant_mock(),
                        TestUtil.create_logarithm_mock(),
                        new NaturalLogarithm())},

                {new System(new Sinus(),
                        TestUtil.create_cosinus_mock(),
                        TestUtil.create_cosecant_mock(),
                        TestUtil.create_cotangent_mock(),
                        TestUtil.create_secant_mock(),
                        new Logarithm(new NaturalLogarithm()),
                        new NaturalLogarithm())},

                {new System(new Sinus(),
                        new Cosinus(new Sinus()),
                        TestUtil.create_cosecant_mock(),
                        TestUtil.create_cotangent_mock(),
                        TestUtil.create_secant_mock(),
                        new Logarithm(new NaturalLogarithm()),
                        new NaturalLogarithm())},

                {new System(new Sinus(),
                        new Cosinus(new Sinus()),
                        new Cosecant(new Sinus()),
                        TestUtil.create_cotangent_mock(),
                        TestUtil.create_secant_mock(),
                        new Logarithm(new NaturalLogarithm()),
                        new NaturalLogarithm())},

                {new System(new Sinus(),
                        new Cosinus(new Sinus()),
                        new Cosecant(new Sinus()),
                        TestUtil.create_cotangent_mock(),
                        new Secant(new Cosinus(new Sinus())),
                        new Logarithm(new NaturalLogarithm()),
                        new NaturalLogarithm())},

                {new System(new Sinus(),
                        new Cosinus(new Sinus()),
                        new Cosecant(new Sinus()),
                        new Cotangent(new Cosinus(new Sinus()), new Sinus()),
                        new Secant(new Cosinus(new Sinus())),
                        new Logarithm(new NaturalLogarithm()),
                        new NaturalLogarithm())}
        });
    }

    @Parameterized.Parameter // first data value (0) is default
    public /* NOT private */ System system;

    @Test
    public void minus_pi() {
        assertEquals(Double.POSITIVE_INFINITY, system.SysResult(-Math.PI));
    }

    @Test
    public void nul() {
        assertEquals(Double.POSITIVE_INFINITY, system.SysResult(0));
    }

    @Test
    public void exact_one() {
        assertEquals(Double.NaN, system.SysResult(1));
    }

    @Test
    public void minus_half_pi() {
        assertEquals(Double.NaN, system.SysResult(-Math.PI/2));
    }

    @Test
    public void minus_three_half_pi() {
        assertEquals(Double.NaN, system.SysResult(-Math.PI/ 2 * 3));
    }

    @Test
    public void first() {
        assertEquals(0, system.SysResult(-1.209), 0.1);
    }

    @Test
    public void second() {
        assertEquals(0, system.SysResult(-2.729), 0.1);
    }

    @Test
    public void third() {
        assertEquals(0, system.SysResult(-4.35), 0.1);
    }

    @Test
    public void fourth() {
        assertEquals(0, system.SysResult(-7.492), 0.1);
    }


    // Log points
    @Test
    public void fifth() {
        assertEquals(0, system.SysResult(0.227), 0.1);
    }

    @Test
    public void sixth() {
        assertEquals(0.831, system.SysResult(0.75), 0.1);
    }

    @Test
    public void seventh() {
        assertEquals(-1.113, system.SysResult(3.5), 0.1);
    }

    @Test
    public void eigth() {
        assertEquals(43.6, system.SysResult(10.0), 0.1);
    }

    @Test
    public void ninth() {
        assertEquals(2.359, system.SysResult(0.367), 0.1);
    }

    @Test
    public void tenth() {
        assertEquals(-2.108, system.SysResult(2.5), 0.1);
    }


    // trigonometric test
    @Test
    public void eleventh() {
        assertEquals(2.028272526, system.SysResult(-0.75), 0.1);
    }

    @Test
    public void twelve() {
        assertEquals(17.622081212, system.SysResult(-2.8), 0.1);
    }

    @Test
    public void thirteen() {
        assertEquals(28.035690194, system.SysResult(-4.0), 0.1);
    }

    @Test
    public void fourteen() {
        assertEquals(1.594851295, system.SysResult(-5.5), 0.1);
    }

    @Test
    public void fifteen() {
        assertEquals(-4.944, system.SysResult(0.175), 0.1);
    }

    @Test
    public void sixteen() {
        assertEquals(-1.161, system.SysResult(1.5), 0.1);
    }



    @Test
    public void minus_pi_two_pi() {
        assertEquals(Double.POSITIVE_INFINITY, system.SysResult(-2*Math.PI-Math.PI));
    }

    @Test
    public void nul_two_pi() {
        assertEquals(Double.POSITIVE_INFINITY, system.SysResult(-2*Math.PI));
    }

    @Test
    public void minus_half_pi_two_pi() {
        assertEquals(Double.NaN, system.SysResult(-2*Math.PI-Math.PI/2));
    }

    @Test
    public void minus_three_half_pi_two_pi() {
        assertEquals(Double.NaN, system.SysResult(-2*Math.PI-Math.PI/ 2 * 3));
    }

    @Test
    public void first_two_pi() {
        assertEquals(0, system.SysResult(-2*Math.PI-1.209), 0.1);
    }

    @Test
    public void second_two_pi() {
        assertEquals(0, system.SysResult(-2*Math.PI-2.729), 0.1);
    }

    @Test
    public void third_two_pi() {
        assertEquals(0, system.SysResult(-2*Math.PI-4.35), 0.1);
    }

    @Test
    public void fourth_two_pi() {
        assertEquals(0, system.SysResult(-2*Math.PI-7.492), 0.1);
    }


    // trigonometric test
    @Test
    public void eleventh_two_pi() {
        assertEquals(2.028272526, system.SysResult(-2*Math.PI-0.75), 0.1);
    }

    @Test
    public void twelve_two_pi() {
        assertEquals(17.622081212, system.SysResult(-2*Math.PI-2.8), 0.1);
    }

    @Test
    public void thirteen_two_pi() {
        assertEquals(28.035690194, system.SysResult(-2*Math.PI-4.0), 0.1);
    }

    @Test
    public void fourtheen_two_pi() {
        assertEquals(1.594851295, system.SysResult(-2*Math.PI-5.5), 0.1);
    }
}
