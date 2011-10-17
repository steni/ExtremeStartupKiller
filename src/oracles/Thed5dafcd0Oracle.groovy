
package oracles

import structures.Question
import structures.Answer

class Thed5dafcd0Oracle extends Oracle {
    final pattern = /which of the following numbers is the largest: (\d*), (\d*), (\d*), (\d*)/

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
        int d = Integer.valueOf(matcher[0][4].toString())

        def valueArray = [ Integer.valueOf(matcher[0][1].toString()),
                       Integer.valueOf(matcher[0][2].toString()),
                       Integer.valueOf(matcher[0][3].toString()),
                       Integer.valueOf(matcher[0][4].toString())]

        int biggest = -1000;
        for ( Integer i : valueArray ) {
            if ( i > biggest ) biggest = i
        }

        return new Answer(biggest.toString())
    }
}
