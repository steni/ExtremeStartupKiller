
import org.junit.Before
import org.junit.Test
import oracles.StorstAvFire
import structures.Question
import oracles.Oracle

public class StorstAvFireTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new StorstAvFire();
        question = new Question(" /?q=84bdc7c0:%20hvilket%20av%20disse%20tallene%20er%20storst:%2099,%20899,%20379,%2052")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=84bdc7c0:%20hvilket%20av%20disse%20tallene%20er%20storst:%2099,%20899,%20379,%2052")
        assert oracle.createAnswer(question).text == "899"
    }
}
