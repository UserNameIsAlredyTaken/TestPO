import com.company.Cosinus;
import com.company.Sinus;
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

}