
import org.junit.Before
import org.junit.Test
import oracles.Thedbd717a0Oracle
import structures.Question
import oracles.Oracle

public class Thedbd717a0OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new Thedbd717a0Oracle();
        question = new Question(" /?q=dbd717a0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20410,%2085,%20771,%2067")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=dbd717a0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20410,%2085,%20771,%2067")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
