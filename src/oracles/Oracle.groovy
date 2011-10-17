package oracles

import structures.Question
import structures.Answer

abstract class Oracle {
    Oracle next

    Oracle() {}

    abstract protected boolean canAnswer(Question question)

    abstract protected Answer createAnswer(Question question)

    public Answer answer(Question question) {
        if (canAnswer(question)) {
            return createAnswer(question)
        } else {
            if (next) {
                return next.answer(question)
            } else {
                throw new CannotAnswerQuestionException(question);
            }
        }
    }
}
