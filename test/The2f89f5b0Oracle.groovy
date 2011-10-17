
import org.junit.Before
import org.junit.Test
import oracles.The2f89f5b0Oracle
import structures.Question
import oracles.Oracle

public class The2f89f5b0OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The2f89f5b0Oracle();
        question = new Question(" /?q=2f89f5b0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20287,%2061,%20894,%2024")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=2f89f5b0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20287,%2061,%20894,%2024")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
