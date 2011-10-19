
import org.junit.Before
import org.junit.Test
import oracles.MatteAPlussBOracle
import structures.Question
import oracles.Oracle

public class MatteAPlussBOracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new MatteAPlussBOracle();
        question = new Question(" /?q=ff3b0170:%20hva%20er%2013%20pluss%2011")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=ff3b0170:%20hva%20er%2013%20pluss%2011")
        assert oracle.createAnswer(question).text == "24"
    }
}
