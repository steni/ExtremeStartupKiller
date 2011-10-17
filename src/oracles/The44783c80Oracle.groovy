
package oracles

import structures.Question
import structures.Answer

class The44783c80Oracle extends Oracle {
    final pattern = /which of the following numbers is the largest: 12, 819, 93, 410/

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
