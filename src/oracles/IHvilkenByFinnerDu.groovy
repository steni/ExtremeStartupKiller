
package oracles

import structures.Question
import structures.Answer

class IHvilkenByFinnerDu extends Oracle {
    final pattern = /i hvilken by finner du Louvre/

    @Override
    public boolean canAnswer(Question question) {
        def matcher = question.text =~ pattern
        return matcher.matches()
    }

    @Override
    public Answer createAnswer(Question question) {

        return new Answer("Paris")
    }
}
