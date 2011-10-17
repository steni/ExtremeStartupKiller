package doers

import oracles.CannotAnswerQuestionException
import structures.Answer
import oracles.Oracle
import structures.Question
import oracles.MathOracle
import oracles.The9f7b32c0Oracle
import oracles.Thed5dafcd0Oracle

class QuizMaster {
    Answer answer
    Question question
    QuizReporter quizReporter
    Oracle oracle = oracleChain()

    QuizMaster(Question question, QuizReporter quizReporter) {
        setQuestion(question)
        setQuizReporter(quizReporter)
    }

    def answer() {
        try {
            tryToAnswer();
        } catch (CannotAnswerQuestionException caqe) {
            println "Cannot answer: " + URLDecoder.decode(caqe.unansweredQuestion.rawText)
            quizReporter.createOracle(caqe.createOracle(), caqe.unansweredQuestion.questionId )
            quizReporter.createTestClass(caqe.createTestClass(), caqe.unansweredQuestion.questionId )
            println caqe.createOracle()
            println caqe.createTestClass()
        }
    }

    def tryToAnswer() throws CannotAnswerQuestionException {
        answer = oracle.answer(question)
        quizReporter.report(answer)
        return answer

    }

    private Oracle oracleChain() {
        Oracle startOracle = new MathOracle()
        startOracle.next = new The9f7b32c0Oracle().next = new Thed5dafcd0Oracle()
        return startOracle
    }


}
