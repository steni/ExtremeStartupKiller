
import org.junit.Before
import org.junit.Test
import oracles.Thed5dafcd0Oracle
import structures.Question
import oracles.Oracle

public class Thed5dafcd0OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new Thed5dafcd0Oracle();
        question = new Question(" /?q=d5dafcd0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20972,%2069,%20267,%209")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=d5dafcd0:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20972,%2069,%20267,%209")
        assert oracle.createAnswer(question).text == "972"
    }
}
