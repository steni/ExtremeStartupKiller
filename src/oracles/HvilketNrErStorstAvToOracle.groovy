
package oracles

import structures.Question
import structures.Answer

class HvilketNrErStorstAvToOracle extends Oracle {
    final pattern = /hvilket av disse tallene er storst: (.*), (.*)/

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

        def largest = a > b ? a : b;

        return new Answer(largest.toString())
    }
}
