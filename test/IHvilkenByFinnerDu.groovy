
import org.junit.Before
import org.junit.Test
import oracles.IHvilkenByFinnerDu
import structures.Question
import oracles.Oracle

public class IHvilkenByFinnerDu {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new oracles.IHvilkenByFinnerDu();
        question = new Question(" /?q=b67cb580:%20i%20hvilken%20by%20finner%20du%20Louvre")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=b67cb580:%20i%20hvilken%20by%20finner%20du%20Louvre")
        assert oracle.createAnswer(question).text == "Paris"
    }
}
