
package oracles

import structures.Question
import structures.Answer

class Thedbd717a0Oracle extends Oracle {
    final pattern = /which of the following numbers is the largest: 410, 85, 771, 67/

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