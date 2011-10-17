package oracles

import structures.Question

class CannotAnswerQuestionException extends Exception {
    Question unansweredQuestion;

    CannotAnswerQuestionException(Question question) {
        this.unansweredQuestion = question;
    }

    String createTestMethod() {
        return """@Test
public void createAnswer_shouldReturn_something() {
    Oracle oracle = new SomeOracle()
    Question question = new Question(" """ + unansweredQuestion.rawText + """")
    assert oracle.createAnswer(question).text == "humanly_deducted_answer"
}
        """
    }

}
