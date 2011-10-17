
import org.junit.Before
import org.junit.Test
import oracles.The238f8230Oracle
import structures.Question
import oracles.Oracle

public class The238f8230OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The238f8230Oracle();
        question = new Question(" /?q=238f8230:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2067,%2095,%2014,%20156")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=238f8230:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2067,%2095,%2014,%20156")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
