
import org.junit.Before
import org.junit.Test
import oracles.Thed0d88ba0Oracle
import structures.Question
import oracles.Oracle

public class Thed0d88ba0OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new Thed0d88ba0Oracle();
        question = new Question(" /?q=d0d88ba0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20349,%2098,%2081,%2072")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=d0d88ba0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20349,%2098,%2081,%2072")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
