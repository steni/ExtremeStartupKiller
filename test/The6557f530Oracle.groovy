
import org.junit.Before
import org.junit.Test
import oracles.The6557f530Oracle
import structures.Question
import oracles.Oracle

public class The6557f530OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The6557f530Oracle();
        question = new Question(" /?q=6557f530:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2049,%2060,%2087,%20221")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=6557f530:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2049,%2060,%2087,%20221")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
