package oracles

import structures.Question
import org.junit.Test;

public class CompareNumbersOracleTest {
    @Test
    public void createAnswer_shouldReturn_something() {
        Oracle oracle = new CompareNumbersOracle()
        Question question = new Question("/?q=3d4574f0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20848,%207")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
