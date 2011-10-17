
import org.junit.Before
import org.junit.Test
import oracles.Thea4117cd0Oracle
import structures.Question
import oracles.Oracle

public class Thea4117cd0OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new Thea4117cd0Oracle();
        question = new Question(" /?q=a4117cd0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20453,%2059,%2087,%20699")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=a4117cd0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20453,%2059,%2087,%20699")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
