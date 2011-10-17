
import org.junit.Before
import org.junit.Test
import oracles.The44783c80Oracle
import structures.Question
import oracles.Oracle

public class The44783c80OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The44783c80Oracle();
        question = new Question(" /?q=44783c80:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2012,%20819,%2093,%20410")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=44783c80:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2012,%20819,%2093,%20410")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
