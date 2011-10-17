package oracles

import structures.Answer

class CompareNumbersOracle extends Oracle {
    @Override
    protected boolean canAnswer(structures.Question question) {
        return false  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected Answer createAnswer(structures.Question question) {
        return null  //To change body of implemented methods use File | Settings | File Templates.
    }
}
