package doers

import structures.Answer

class QuizReporter {
    BufferedOutputStream bufferedOutputStream

    QuizReporter(BufferedOutputStream bufferedOutputStream) {
        setBufferedOutputStream bufferedOutputStream
    }

    void report(Answer answer) {
        outputHeader()
        bufferedOutputStream << answer.text
        bufferedOutputStream.flush()
    }

    private def outputHeader() {
        bufferedOutputStream << "Content-Type: text/plain; charset=UTF-8\n"
        bufferedOutputStream << "\n"
    }

    def createOracle(String oracleContents, String questionId) {
        def f = new File("oracles/The" + questionId + "Oracle.groovy" )
        f << oracleContents
    }

    def createTestClass(String testClassContents, String questionId) {
        def f = new File("../test/The" + questionId + "OracleTest.groovy" )
        f << testClassContents
    }
}
