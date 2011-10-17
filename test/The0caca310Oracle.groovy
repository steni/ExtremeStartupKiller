
import org.junit.Before
import org.junit.Test
import oracles.The0caca310Oracle
import structures.Question
import oracles.Oracle

public class The0caca310OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The0caca310Oracle();
        question = new Question(" /?q=0caca310:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2023,%20571")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=0caca310:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2023,%20571")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
