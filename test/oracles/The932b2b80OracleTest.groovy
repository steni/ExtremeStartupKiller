import org.junit.Before
import org.junit.Test
import oracles.The9f7b32c0Oracle
import structures.Question
import oracles.Oracle

public class The9f7b32c0OracleTest {
    Oracle oracle
    Question question

    @Before
    public void setUp() throws Exception {
        oracle = new The9f7b32c0Oracle();
        question = new Question(" /?q=9f7b32c0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20678,%2075")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=9f7b32c0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20678,%2075")
        assert oracle.createAnswer(question).text == "678"
    }
}