
package oracles

import structures.Question
import structures.Answer

class The298d9930Oracle extends Oracle {
    final pattern = /which of the following numbers is the largest: 34, 45, 127, 872/

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
        int sum = a+b

        return new Answer(sum.toString())
    }
}
