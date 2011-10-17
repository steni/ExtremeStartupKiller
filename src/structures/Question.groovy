package structures

class Question {
    String text
    String rawText

    Question() {}

    Question(String questionText) {
        rawText = questionText.trim()
        setText(questionText)
    }

    void setText(String text) {
        def matcher = URLDecoder.decode(text) =~ /q=(.*):(.*)/
        this.text = matcher[0][2].toString().trim()
    }


}
