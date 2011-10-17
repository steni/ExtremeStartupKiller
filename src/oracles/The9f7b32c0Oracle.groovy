package oracles

import structures.Question
import structures.Answer

class The9f7b32c0Oracle extends Oracle {
    final pattern = /which of the following numbers is the largest: (\d*)[, ]{2}(\d*)/

    @Override
    public boolean canAnswer(Question question) {
        def matcher = question.text =~ pattern
        return matcher.matches()
    }

    @Override
    public Answer createAnswer(Question question) {
        def matcher = question.text =~ pattern

        int largest
        int a = Integer.valueOf(matcher[0][1].toString())
        int b = Integer.valueOf(matcher[0][2].toString())
        largest = a > b ? a : b

        return new Answer(largest.toString())
    }
}
