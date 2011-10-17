package oracles

import structures.Question

class CannotAnswerQuestionException extends Exception {
    Question unansweredQuestion
    String potentialOracleName, potentialOracleTestName

    CannotAnswerQuestionException(Question question) {
        this.unansweredQuestion = question;
        potentialOracleName = "The" + unansweredQuestion.questionId + "Oracle"
        potentialOracleTestName = potentialOracleName + "Test"
    }

    String createOracle() {
        return """
package oracles

import structures.Question
import structures.Answer

class """ + potentialOracleName + """ extends Oracle {
    final pattern = /""" + unansweredQuestion.text + """/

    @Override
    public boolean canAnswer(Question question) {
        def matcher = question.text =~ pattern
        return matcher.matches()
    }

    @Override
    public Answer createAnswer(Question question) {
        def matcher = question.text =~ pattern
        int a = Integer.valueOf(matcher[0][1].toString())
        int b = Integer.valueOf(matcher[0][2].toString())
        int sum = a+b

        return new Answer(sum.toString())
    }
}
"""
    }

    String createTestClass() {
        return """
import org.junit.Before
import org.junit.Test
import oracles.""" + potentialOracleName + """
import structures.Question
import oracles.Oracle

public class """ + potentialOracleTestName + """ {
    Oracle oracle
    Question question
    @Before
    public void setUp() throws Exception {
        oracle = new """ + potentialOracleName + """();
        question = new Question(" """ + unansweredQuestion.rawText + """")
    }

    @Test
    public void canAnswer_shouldBeTrue_forQuestion() {
        assert oracle.canAnswer(question)
    }

    @Test
    public void createAnswer_shouldReturn_theAnswer() {
        Question question = new Question(""" + '"' + unansweredQuestion.rawText + """")
        assert oracle.createAnswer(question).text == "humanly_deducted_answer"
    }
}
"""
    }
}
