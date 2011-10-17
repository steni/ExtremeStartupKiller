
import org.junit.Before
import org.junit.Test
import oracles.The298d9930Oracle
import structures.Question
import oracles.Oracle

public class The298d9930OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The298d9930Oracle();
        question = new Question(" /?q=298d9930:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2034,%2045,%20127,%20872")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=298d9930:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2034,%2045,%20127,%20872")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
