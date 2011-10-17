import oracles.CannotAnswerQuestionException
import structures.Answer
import oracles.Oracle
import structures.Question
import oracles.MathOracle

class QuizMaster {
    Answer answer
    Question question
    Oracle oracle = oracleChain()

    QuizMaster(uri, out) {
        question = new Question(uri)
        try {
            answer = oracle.answer(question)
            outputAnswer(out)
        } catch (CannotAnswerQuestionException caqe) {
            helpMeAnswer(caqe)
        }
    }

    private def helpMeAnswer(CannotAnswerQuestionException caqe) {
        println "Cannot answer: " + URLDecoder.decode(caqe.unansweredQuestion.rawText)
        println caqe.createTestMethod()
        //println caqe.createCanAnswerMethod()
    }

    private def outputAnswer(out) {
       //  outputHeader(out)
      //  out << answer.text
        println question.text + ": " + answer.text
    }

    private Oracle oracleChain() {
        return new MathOracle() // CompareNumbersOracle()
    }

    private def outputHeader(out) {
        out << "Content-Type: text/plain; charset=UTF-8\n"
        out << "\n"
    }
}
