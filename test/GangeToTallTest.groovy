
import org.junit.Before
import org.junit.Test
import oracles.GangeToTall
import structures.Question
import oracles.Oracle

public class GangeToTallTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new GangeToTall();
        question = new Question(" /?q=4a970480:%20hva%20er%208%20ganget%20med%2017")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=4a970480:%20hva%20er%208%20ganget%20med%2017")
        assert oracle.createAnswer(question).text == "136"
    }
}
