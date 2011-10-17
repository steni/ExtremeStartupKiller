import org.junit.Before
import org.junit.Test
import oracles.MathOracle
import structures.Question

public class MathOracleTest {
    MathOracle mathOracle;
    @Before
    public void setUp() throws Exception {
        mathOracle = new MathOracle();
    }

    @Test
    public void canAnswer_shouldBeTrue_forMathQuestions() {
        Question question = new Question("/?q=7f502b30:%20what%20is%204%20plus%206")
        assert mathOracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_sumOfArguments() {
        Question question = new Question("/?q=7f502b30:%20what%20is%204%20plus%206")
        assert mathOracle.createAnswer(question).text == "10"
    }
}
