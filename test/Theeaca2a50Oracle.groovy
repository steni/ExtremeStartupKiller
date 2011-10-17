
import org.junit.Before
import org.junit.Test
import oracles.Theeaca2a50Oracle
import structures.Question
import oracles.Oracle

public class Theeaca2a50OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new Theeaca2a50Oracle();
        question = new Question(" /?q=eaca2a50:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20202,%2050,%2055,%20872")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=eaca2a50:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20202,%2050,%2055,%20872")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
