
import org.junit.Before
import org.junit.Test
import oracles.The3e815780Oracle
import structures.Question
import oracles.Oracle

public class The3e815780OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The3e815780Oracle();
        question = new Question(" /?q=3e815780:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2069,%20124,%206,%2046")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=3e815780:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2069,%20124,%206,%2046")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
