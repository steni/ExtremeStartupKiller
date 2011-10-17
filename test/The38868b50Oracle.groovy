
import org.junit.Before
import org.junit.Test
import oracles.The38868b50Oracle
import structures.Question
import oracles.Oracle

public class The38868b50OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The38868b50Oracle();
        question = new Question(" /?q=38868b50:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2026,%2065,%20815,%20367")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=38868b50:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2026,%2065,%20815,%20367")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
