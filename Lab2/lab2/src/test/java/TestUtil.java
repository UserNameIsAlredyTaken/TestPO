import com.company.*;
import org.mockito.Mockito;

class TestUtil {
    static Sinus create_sinus_mock()
    {
        Sinus instance = Mockito.mock(Sinus.class);
        Mockito.when(instance.sin(-1.209)).thenReturn(-0.9352625144);
        Mockito.when(instance.sin(-2.729)).thenReturn(-0.40098576221);
        Mockito.when(instance.sin(-4.35)).thenReturn(0.93505257755);
        Mockito.when(instance.sin(-7.492)).thenReturn(-0.93519690797);

        Mockito.when(instance.sin(-1.57079632679)).thenReturn(1.0);
        Mockito.when(instance.sin(0)).thenReturn(0.0);
        Mockito.when(instance.sin(-3.14159265359)).thenReturn(0.0);
        Mockito.when(instance.sin(-4.71238898038)).thenReturn(-1.0);

        return instance;
    }

    static Cosinus create_cosinus_mock()
    {
        Cosinus instance = Mockito.mock(Cosinus.class);
        Mockito.when(instance.cos(-1.209)).thenReturn(0.35395484055);
        Mockito.when(instance.cos(-2.729)).thenReturn(-0.91608428569);
        Mockito.when(instance.cos(-4.35)).thenReturn(-0.35450906504);
        Mockito.when(instance.cos(-7.492)).thenReturn(0.35412814533);

        Mockito.when(instance.cos(-1.57079632679)).thenReturn(0.0);
        Mockito.when(instance.cos(0)).thenReturn(1.0);
        Mockito.when(instance.cos(-3.14159265359)).thenReturn(-1.0);
        Mockito.when(instance.cos(-4.71238898038)).thenReturn(0.0);

        return instance;
    }

    static Secant create_secant_mock()
    {
        Secant  instance = Mockito.mock(Secant.class);
        Mockito.when(instance.sec(-1.209)).thenReturn(2.8252191676);
        Mockito.when(instance.sec(-2.729)).thenReturn(-1.09160261301);
        Mockito.when(instance.sec(-4.35)).thenReturn(-2.82080233933);
        Mockito.when(instance.sec(-7.492)).thenReturn(2.82383654948);

        Mockito.when(instance.sec(-1.57079632679)).thenReturn(Double.POSITIVE_INFINITY);
        Mockito.when(instance.sec(0)).thenReturn(1.0);
        Mockito.when(instance.sec(-3.14159265359)).thenReturn(-1.0);
        Mockito.when(instance.sec(-4.71238898038)).thenReturn(Double.NEGATIVE_INFINITY);

        return instance;
    }

    static Cosecant create_cosecant_mock()
    {
        Cosecant instance = Mockito.mock(Cosecant.class);
        Mockito.when(instance.cosec(-1.209)).thenReturn(-1.06921851844);
        Mockito.when(instance.cosec(-2.729)).thenReturn(-2.49385413205);
        Mockito.when(instance.cosec(-4.35)).thenReturn(1.06945857805);
        Mockito.when(instance.cosec(-7.492)).thenReturn(-1.06929352682);

        Mockito.when(instance.cosec(-1.57079632679)).thenReturn(-1.0);
        Mockito.when(instance.cosec(0)).thenReturn(Double.POSITIVE_INFINITY);
        Mockito.when(instance.cosec(-3.14159265359)).thenReturn(Double.POSITIVE_INFINITY);
        Mockito.when(instance.cosec(-4.71238898038)).thenReturn(1.0);

        return instance;
    }

    static Cotangent create_cotangent_mock()
    {
        Cotangent instance = Mockito.mock(Cotangent.class);
        Mockito.when(instance.ctg(-1.209)).thenReturn(-0.37845507021);
        Mockito.when(instance.ctg(-2.729)).thenReturn(2.28458058118);
        Mockito.when(instance.ctg(-4.35)).thenReturn(-0.37913276061);
        Mockito.when(instance.ctg(-7.492)).thenReturn(-0.37866693347);

        Mockito.when(instance.ctg(-1.57079632679)).thenReturn(0.0);
        Mockito.when(instance.ctg(0)).thenReturn(Double.POSITIVE_INFINITY);
        Mockito.when(instance.ctg(-3.14159265359)).thenReturn(Double.NEGATIVE_INFINITY);
        Mockito.when(instance.ctg(-4.71238898038)).thenReturn(0.0);

        return instance;
    }


    static Logarithm create_logarithm_mock()
    {
        Logarithm instance = Mockito.mock(Logarithm.class);
        Mockito.when(instance.log(0.227, 2)).thenReturn(-2.13923579737);
        Mockito.when(instance.log(0.75, 2)).thenReturn(-0.41503749927);
        Mockito.when(instance.log(3.5, 2)).thenReturn(1.80735492206);
        Mockito.when(instance.log(10.0, 2)).thenReturn(3.32192809489);

        Mockito.when(instance.log(0.0, 2)).thenReturn(Double.NEGATIVE_INFINITY);
        Mockito.when(instance.log(0.367, 2)).thenReturn(-1.44614803182);
        Mockito.when(instance.log(2.5, 2)).thenReturn(1.32192809489);



        Mockito.when(instance.log(0.227, 5)).thenReturn(-0.9213187);
        Mockito.when(instance.log(0.75, 5)).thenReturn(-0.1787469);
        Mockito.when(instance.log(3.5, 5)).thenReturn(0.7783854);
        Mockito.when(instance.log(10.0, 5)).thenReturn(1.4306766);

        Mockito.when(instance.log(0.0, 5)).thenReturn(Double.NEGATIVE_INFINITY);
        Mockito.when(instance.log(0.367, 5)).thenReturn(-0.6228221);
        Mockito.when(instance.log(2.5, 5)).thenReturn(0.5693234);


        Mockito.when(instance.log(0.227, 5)).thenReturn(-0.6439741);
        Mockito.when(instance.log(0.75, 5)).thenReturn(-0.1249387);
        Mockito.when(instance.log(3.5, 5)).thenReturn(0.544068);
        Mockito.when(instance.log(10.0, 5)).thenReturn(1.0);

        Mockito.when(instance.log(0.0, 5)).thenReturn(Double.NEGATIVE_INFINITY);
        Mockito.when(instance.log(0.367, 5)).thenReturn(-0.4353339);
        Mockito.when(instance.log(2.5, 5)).thenReturn(0.39794);

        return instance;
    }


    static NaturalLogarithm create_natural_logarithm_mock()
    {
        NaturalLogarithm instance = Mockito.mock(NaturalLogarithm.class);
        Mockito.when(instance.ln(0.227)).thenReturn(-1.4828053);
        Mockito.when(instance.ln(0.75)).thenReturn(-0.2876821);
        Mockito.when(instance.ln(3.5)).thenReturn(1.252763);
        Mockito.when(instance.ln(10.0)).thenReturn(2.3025851);

        Mockito.when(instance.ln(0.0)).thenReturn(Double.NEGATIVE_INFINITY);
        Mockito.when(instance.ln(0.367)).thenReturn(-1.0023934);
        Mockito.when(instance.ln(2.5)).thenReturn(0.9162907);

        return instance;
    }
}