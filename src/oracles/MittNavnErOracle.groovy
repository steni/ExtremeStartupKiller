
package oracles

import structures.Question
import structures.Answer

class MittNavnErOracle extends Oracle {
    final pattern = /mitt navn er (.*). hva heter jeg/

    @Override
    public boolean canAnswer(Question question) {
        def matcher = question.text =~ pattern
        return matcher.matches()
    }

    @Override
    public Answer createAnswer(Question question) {
        def matcher = question.text =~ pattern
        String navn = matcher[0][1].toString()

        return new Answer(navn)
    }
}
