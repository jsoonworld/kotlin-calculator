package calculator.domain

class StringCalculator(
    private val delimiterParser: DelimiterParser = DelimiterParser()
) {
    fun calculate(input: String): Int{
        if (input.isBlank()) {
            return 0
        }

        val (delimiter, numbersPart) = delimiterParser.parse(input)
        val tokens = NumberTokenizer(numbersPart, delimiter).tokenize()
        val numbers = tokens.map(NumberValidator::validate)

        return numbers.sum()
    }
}