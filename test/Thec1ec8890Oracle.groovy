
import org.junit.Before
import org.junit.Test
import oracles.Thec1ec8890Oracle
import structures.Question
import oracles.Oracle

public class Thec1ec8890OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new Thec1ec8890Oracle();
        question = new Question(" /?q=c1ec8890:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2074,%2089,%20951,%20442")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=c1ec8890:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2074,%2089,%20951,%20442")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
