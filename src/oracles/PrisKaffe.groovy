
package oracles

import structures.Question
import structures.Answer

class PrisKaffe extends Oracle {
    final pattern = /hvor mange kroner koster ett stykk kaffe/

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
