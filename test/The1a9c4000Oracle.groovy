
import org.junit.Before
import org.junit.Test
import oracles.The1a9c4000Oracle
import structures.Question
import oracles.Oracle

public class The1a9c4000OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The1a9c4000Oracle();
        question = new Question(" /?q=1a9c4000:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%205,%20937,%2046,%20838")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=1a9c4000:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%205,%20937,%2046,%20838")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
