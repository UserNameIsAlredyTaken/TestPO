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
}