
import org.junit.Before
import org.junit.Test
import oracles.PlusGangerOracle
import structures.Question
import oracles.Oracle

public class PlusGangerOracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new PlusGangerOracle();
        question = new Question(" /?q=6ecf5000:%20hva%20er%202%20ganget%20med%204%20pluss%206")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=6ecf5000:%20hva%20er%202%20ganget%20med%204%20pluss%206")
        assert oracle.createAnswer(question).text == "14"
    }
}
