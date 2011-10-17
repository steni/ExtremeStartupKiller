
import org.junit.Before
import org.junit.Test
import oracles.The7148a7c0Oracle
import structures.Question
import oracles.Oracle

public class The7148a7c0OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The7148a7c0Oracle();
        question = new Question(" /?q=7148a7c0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2026,%20755,%20540,%2050")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=7148a7c0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2026,%20755,%20540,%2050")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
