package calculator.domain

class NumberTokenizer(
    private val numbersPart: String,
    private val delimiterRegex: String
) {
    fun tokenize(): List<String>{
        return numbersPart.split(Regex(delimiterRegex)).map(String::trim)
    }
}