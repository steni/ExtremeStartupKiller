
import org.junit.Before
import org.junit.Test

import structures.Question
import oracles.Oracle
import oracles.HvaHeterLagetOracle

public class HvaHeterLagetOracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new HvaHeterLagetOracle();
        question = new Question(" /?q=00473fe0:%20hva%20heter%20laget%20deres")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=00473fe0:%20hva%20heter%20laget%20deres")
        assert oracle.createAnswer(question).text == "Sten Morten (Groovy)"
    }
}
