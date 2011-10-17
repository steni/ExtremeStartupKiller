
import org.junit.Before
import org.junit.Test
import oracles.Thefcc2c620Oracle
import structures.Question
import oracles.Oracle

public class Thefcc2c620OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new Thefcc2c620Oracle();
        question = new Question(" /?q=fcc2c620:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20723,%2080,%2031,%2078")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=fcc2c620:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20723,%2080,%2031,%2078")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
