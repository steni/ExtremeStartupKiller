
import oracles.Oracle
import oracles.PrisKaffe
import org.junit.Before
import org.junit.Test
import structures.Question
import oracles.PrisTe

public class PrisTeTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new PrisTe();
        question = new Question(" /?q=a68b07c0:%20hvor%20mange%20kroner%20koster%20ett%20stykk%20te")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=a68b07c0:%20hvor%20mange%20kroner%20koster%20ett%20stykk%20te")
        assert oracle.createAnswer(question).text == "20"
    }
}
