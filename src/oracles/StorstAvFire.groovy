
package oracles

import structures.Question
import structures.Answer

class StorstAvFire extends Oracle {
    final pattern = /hvilket av disse tallene er storst: (.*), (.*), (.*), (.*)/

    @Override
    public boolean canAnswer(Question question) {
        def matcher = question.text =~ pattern
        return matcher.matches()
    }

    @Override
    public Answer createAnswer(Question question) {
        def matcher = question.text =~ pattern
        def tall  = [   Integer.valueOf(matcher[0][1].toString()),
                        Integer.valueOf(matcher[0][2].toString()),
                        Integer.valueOf(matcher[0][3].toString()),
                        Integer.valueOf(matcher[0][4].toString()) ]

        def max = -1000
        for ( Integer n : tall  ) {
            if ( n > max ) max = n
        }

        return new Answer(max.toString())
    }
}
