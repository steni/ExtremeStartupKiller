package structures

class Question {
    String text
    String rawText
    String questionId
    String humanReadableRawQuestion

    Question() {}

    Question(String questionText) {
        setText(questionText)
    }

    void setText(String text) {
        rawText = text.trim()
        def matcher = URLDecoder.decode(text) =~ /q=([^:]*):(.*)/
        setHumanReadableRawQuestion(matcher[0][0].toString().trim())
        setQuestionId(matcher[0][1].toString().trim())
        this.text = matcher[0][2].toString().trim()
    }


}
