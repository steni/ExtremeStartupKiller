
package oracles

import structures.Question
import structures.Answer

class HvaHeterLagetDeresOracle extends Oracle {
    final pattern = /hva heter laget deres/

    @Override
    public boolean canAnswer(Question question) {
        def matcher = question.text =~ pattern
        return matcher.matches()
    }

    @Override
    public Answer createAnswer(Question question) {


        return new Answer("Sten Morten (Groovy)")
    }
}
