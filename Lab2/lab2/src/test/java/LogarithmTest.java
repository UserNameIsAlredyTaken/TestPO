import net.jqwik.api.*;

import java.util.List;
import com.company.Logarithm;
import org.assertj.core.data.Offset;
import org.assertj.core.data.Percentage;

import static org.assertj.core.api.Assertions.assertThat;

public class LogarithmTest {

    @Provide
    Arbitrary<Integer> first(){
        return Arbitraries.integers().between(0, 300);
    }

    @Property
    void log_check(@ForAll("first") Integer any_int){
        Logarithm ln = new Logarithm();
        double value = ln.ln(any_int);
        double pow = Math.pow(Math.E, value);
        assertThat(pow).isCloseTo(any_int, Offset.offset(0.001));
    }
}
