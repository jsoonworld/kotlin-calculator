package calculator.domain

interface DelimiterParser {
    fun supports(input: String): Boolean
    fun extractDelimiter(input: String): String
    fun extractNumbers(input: String): String
}