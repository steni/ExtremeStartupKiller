
package oracles

import structures.Answer
import structures.Question

class PrisTe extends Oracle {
    final pattern = /hvor mange kroner koster ett stykk te/

    @Override
    public boolean canAnswer(Question question) {
        def matcher = question.text =~ pattern
        return matcher.matches()
    }

    @Override
    public Answer createAnswer(Question question) {

        return new Answer("20".toString())
    }
}
