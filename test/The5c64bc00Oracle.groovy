
import org.junit.Before
import org.junit.Test
import oracles.The5c64bc00Oracle
import structures.Question
import oracles.Oracle

public class The5c64bc00OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The5c64bc00Oracle();
        question = new Question(" /?q=5c64bc00:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20829,%2092,%20118,%2039")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=5c64bc00:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20829,%2092,%20118,%2039")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
