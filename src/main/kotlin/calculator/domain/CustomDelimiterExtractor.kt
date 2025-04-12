package calculator.domain

class CustomDelimiterExtractor : DelimiterExtractor {

    override fun supports(input: String): Boolean = input.startsWith(CUSTOM_PREFIX)

    override fun extract(input: String): Pair<String, String> {
        val normalized = input.replace(ESCAPED_NEWLINE, NEWLINE)
        val endOfDelimiterIndex = normalized.indexOf(NEWLINE)
        require(endOfDelimiterIndex != -1) { INVALID_FORMAT_ERROR }

        val delimiter = normalized.substring(CUSTOM_PREFIX.length, endOfDelimiterIndex)
        val numbersPart = normalized.substring(endOfDelimiterIndex + 1)
        return Regex.escape(delimiter) to numbersPart
    }

    companion object {
        private const val CUSTOM_PREFIX = "//"
        private const val ESCAPED_NEWLINE = "\\n"
        private const val NEWLINE = "\n"
        private const val INVALID_FORMAT_ERROR = "커스텀 구분자 형식이 잘못되었습니다."
    }
}
