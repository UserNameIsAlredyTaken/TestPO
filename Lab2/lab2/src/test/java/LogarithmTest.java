//import com.company.Logarithm;
//import com.company.NaturalLogarithm;
//import net.jqwik.api.*;
//import org.assertj.core.data.Offset;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class LogarithmTest {
//    @Provide
//    Arbitrary<Integer> first(){
//        return Arbitraries.integers().between(0, 300);
//    }
//
//    @Property
//    void log_5_check(@ForAll("first") Integer any_int){
//        Logarithm ln = new Logarithm(new NaturalLogarithm());
//        double value = ln.log(any_int, 5);
//        double pow = Math.pow(5, value);
//        assertThat(pow).isCloseTo(any_int, Offset.offset(0.001));
//    }
//
//    @Property
//    void log_2_check(@ForAll("first") Integer any_int){
//        Logarithm ln = new Logarithm(new NaturalLogarithm());
//        double value = ln.log(any_int, 2);
//        double pow = Math.pow(2, value);
//        assertThat(pow).isCloseTo(any_int, Offset.offset(0.001));
//    }
//
//    @Property
//    void log_10_check(@ForAll("first") Integer any_int){
//        Logarithm ln = new Logarithm(new NaturalLogarithm());
//        double value = ln.log(any_int, 10);
//        double pow = Math.pow(10, value);
//        assertThat(pow).isCloseTo(any_int, Offset.offset(0.001));
//    }
//}
