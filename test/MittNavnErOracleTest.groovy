
import org.junit.Before
import org.junit.Test

import structures.Question
import oracles.Oracle
import oracles.MittNavnErOracle

public class MittNavnErOracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new MittNavnErOracle();
        question = new Question(" /?q=6f24a8d0:%20mitt%20navn%20er%20Mari.%20hva%20heter%20jeg")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=6f24a8d0:%20mitt%20navn%20er%20Mari.%20hva%20heter%20jeg")
        assert oracle.createAnswer(question).text == "Mari"

        Question question2 = new Question("?q=bfdfb3c0:%20mitt%20navn%20er%20Hans.%20hva%20heter%20jeg")
        assert oracle.createAnswer(question2).text == "Hans"
    }
}
