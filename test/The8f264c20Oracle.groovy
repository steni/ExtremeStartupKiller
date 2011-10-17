
import org.junit.Before
import org.junit.Test
import oracles.The8f264c20Oracle
import structures.Question
import oracles.Oracle

public class The8f264c20OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new The8f264c20Oracle();
        question = new Question(" /?q=8f264c20:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%201,%20476,%2026,%20109")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=8f264c20:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%201,%20476,%2026,%20109")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
