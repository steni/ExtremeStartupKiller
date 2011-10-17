
import org.junit.Before
import org.junit.Test
import oracles.The9e1a3ec0Oracle
import structures.Question
import oracles.Oracle

public class The9e1a3ec0OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The9e1a3ec0Oracle();
        question = new Question(" /?q=9e1a3ec0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20723,%20416,%2072,%2046")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=9e1a3ec0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20723,%20416,%2072,%2046")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
