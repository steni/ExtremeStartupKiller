
import org.junit.Before
import org.junit.Test
import oracles.Thef3ced690Oracle
import structures.Question
import oracles.Oracle

public class Thef3ced690OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new Thef3ced690Oracle();
        question = new Question(" /?q=f3ced690:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20784,%209,%20293,%20100")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=f3ced690:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20784,%209,%20293,%20100")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
