package calculator.domain

interface DelimiterExtractor {
    fun supports(input: String): Boolean
    fun extract(input: String): Pair<String, String>

}