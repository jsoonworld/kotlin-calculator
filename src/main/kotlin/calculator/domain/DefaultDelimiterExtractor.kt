package calculator.domain

class DefaultDelimiterExtractor : DelimiterExtractor {

    override fun supports(input: String): Boolean = !input.startsWith(CUSTOM_PREFIX)

    override fun extract(input: String): Pair<String, String> {
        return DEFAULT_DELIMITER_REGEX to input
    }

    companion object {
        private const val CUSTOM_PREFIX = "//"
        private const val DEFAULT_DELIMITER_REGEX = ",|:"
    }
}
