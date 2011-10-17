
import org.junit.Before
import org.junit.Test
import oracles.The50667350Oracle
import structures.Question
import oracles.Oracle

public class The50667350OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The50667350Oracle();
        question = new Question(" /?q=50667350:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20301,%2028,%2034,%20405")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=50667350:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20301,%2028,%2034,%20405")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
