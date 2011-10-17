package oracles

import structures.Answer
import structures.Question

class CompareNumbersOracle extends Oracle {
    @Override
    public boolean canAnswer(Question question) {
        def matcher = question.text =~ /95, 955/
        return matcher.matches()
    }

    @Override
    public Answer createAnswer(structures.Question question) {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }
}
