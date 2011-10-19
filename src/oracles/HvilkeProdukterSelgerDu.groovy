
package oracles

import structures.Question
import structures.Answer

class HvilkeProdukterSelgerDu extends Oracle {
    final pattern = /hvilke produkter har du til salgs/

    @Override
    public boolean canAnswer(Question question) {
        return question.text == "hvilke produkter har du til salgs (kommaseparert)"
    }

    @Override
    public Answer createAnswer(Question question) {
        return new Answer("kaffe,te")
    }
}
