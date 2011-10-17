import org.junit.Test
import org.junit.Before
import structures.Question

public class QuestionTest {
    private Question question
    public static String incomingQuestion = "/?q=7d87e2a0:%20what%20is%2014%20plus%2010"

    @Before
    public void setup() {
        question = new Question()
    }

    @Test
    public void getQuestion_shouldUrlDecodeAQuestion() throws Exception {
        String nonEncodedQuestion = "what is 14 plus 10"
        String nonEncodedUri = "/?q=7d87e2a0:" + nonEncodedQuestion
        question.text = URLEncoder.encode(nonEncodedUri)
        assert nonEncodedQuestion == question.text
    }

    @Test
    public void setQuestion() throws Exception {
        question.text = "/?q=7d87e2a0:%20what%20is%2014%20plus%2010"
    }
}
