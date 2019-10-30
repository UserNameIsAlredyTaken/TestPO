//import com.company.Cosinus;
//import com.company.Sinus;
//import net.jqwik.api.*;
//import org.assertj.core.data.Offset;
//import org.junit.Test;
//
//import static junit.framework.TestCase.assertEquals;
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class CosinusTest {
//
//    @Example
//    public void minus_half_pi()
//    {
//        assertThat(new Cosinus(new Sinus()).cos(-1.57079632679)).isCloseTo(0.0, Offset.offset(0.001));
//    }
//
//    @Provide
//    Arbitrary<Integer> first(){
//        return Arbitraries.integers();
//    }
//
//    @Property
//    void log_5_check(@ForAll("first") Integer any_int){
//        Cosinus cos = new Cosinus(new Sinus());
//        double value = cos.cos(any_int);
//        double expected_value = new Sinus().sin(any_int + Math.PI / 2);
//        assertThat(expected_value).isCloseTo(value, Offset.offset(0.001));
//    }
//
//}
