
import org.junit.Before
import org.junit.Test
import oracles.The4a6f96c0Oracle
import structures.Question
import oracles.Oracle

public class The4a6f96c0OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The4a6f96c0Oracle();
        question = new Question(" /?q=4a6f96c0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20514,%20449,%2043,%2037")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=4a6f96c0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20514,%20449,%2043,%2037")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
