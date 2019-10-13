import com.company.NaturalLogarithm;
import net.jqwik.api.*;

import java.util.List;
import com.company.Logarithm;
import org.assertj.core.data.Offset;
import org.assertj.core.data.Percentage;

import static org.assertj.core.api.Assertions.assertThat;

public class NaturalLogarithmTest {

    @Provide
    Arbitrary<Integer> first(){
        return Arbitraries.integers().between(0, 300);
    }

    @Property
    void log_check(@ForAll("first") Integer any_int){
        NaturalLogarithm ln = new NaturalLogarithm();
        double value = ln.ln(any_int);
        double pow = Math.pow(Math.E, value);
        assertThat(pow).isCloseTo(any_int, Offset.offset(0.001));
    }
}
