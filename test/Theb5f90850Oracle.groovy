
import org.junit.Before
import org.junit.Test
import oracles.Theb5f90850Oracle
import structures.Question
import oracles.Oracle

public class Theb5f90850OracleTest {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new Theb5f90850Oracle();
        question = new Question(" /?q=b5f90850:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20608,%2097,%2045,%20693")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question("/?q=b5f90850:%20which%20of%20the%20following%20numbers%20is%20the%20largest:%20608,%2097,%2045,%20693")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
