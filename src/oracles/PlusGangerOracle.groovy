
package oracles

import structures.Question
import structures.Answer

class PlusGangerOracle extends Oracle {
    final pattern = /hva er (.*) ganget med (.*) pluss (.*)/

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
        int c = Integer.valueOf(matcher[0][3].toString())

        int sum = a*b+c;

        return new Answer(sum.toString())
    }
}
