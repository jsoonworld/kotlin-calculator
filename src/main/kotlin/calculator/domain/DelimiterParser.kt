package calculator.domain

class DelimiterParser {
    private val extractor: List<DelimiterExtractor> = listOf(
        CustomDelimiterExtractor(),
        DefaultDelimiterExtractor()
    )

    fun parse(input: String): Pair<String, String> {
        return extractor.first { it.supports(input) }.extract(input)
    }
}
