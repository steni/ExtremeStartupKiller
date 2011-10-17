import structures.Question
import org.junit.Test
import oracles.Oracle
import oracles.CompareNumbersOracle;

public class CompareNumbersOracleTest {
    @Test
    public void createAnswer_shouldReturn_biggeestNumber() {
        Oracle oracle = new CompareNumbersOracle()
        Question question = new Question(" /?q=b43a0f20:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2095,%20955")
        assert oracle.createAnswer(question).text == "995"
    }

    @Test
    public void canAnswer_shouldReturn_true() {
        Oracle oracle = new CompareNumbersOracle()
        Question question = new Question(" /?q=b43a0f20:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2095,%20955")
        assert oracle.canAnswer(question)

    }
}
