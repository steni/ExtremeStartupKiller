
import org.junit.Before
import org.junit.Test
import oracles.GangerOracle
import structures.Question
import oracles.Oracle

public class GangerOracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new GangerOracle();
        question = new Question(" /?q=36d7d4e0:%20hva%20er%2015%20ganget%20med%204")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=36d7d4e0:%20hva%20er%2015%20ganget%20med%204")
        assert oracle.createAnswer(question).text == "60"
    }
}
