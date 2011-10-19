package doers

import oracles.CannotAnswerQuestionException
import structures.Answer
import oracles.Oracle
import structures.Question
import oracles.MathOracle
import oracles.HvaHeterLagetDeresOracle
import oracles.MittNavnErOracle
import oracles.HvilketNrErStorstAvToOracle
import oracles.HvaHeterLagetOracle
import oracles.MatteAPlussBOracle
import oracles.StorstAvFire
import oracles.IHvilkenByFinnerDu
import oracles.GangeToTall

import oracles.PrisKaffe
import oracles.PrisTe
import oracles.PlusGangerOracle
import oracles.GangerOracle
import oracles.HvilkeProdukterSelgerDu

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
            quizReporter.createOracle(caqe.createOracle(), caqe.unansweredQuestion.questionId)
            quizReporter.createTestClass(caqe.createTestClass(), caqe.unansweredQuestion.questionId)
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
        startOracle.next =
            new HvaHeterLagetDeresOracle().next = new MittNavnErOracle().next = new HvilketNrErStorstAvToOracle()
                    .next = new HvaHeterLagetOracle().next = new MatteAPlussBOracle().next = new StorstAvFire().next =
                new IHvilkenByFinnerDu().next = new GangeToTall().next = new HvilkeProdukterSelgerDu().next = new PrisKaffe().next =
                    new PlusGangerOracle().next = new PrisTe().next = new GangerOracle()
        return startOracle
    }


}
