package calculator.domain

object DelimiterParser {
    private const val CUSTOM_PREFIX = "//"
    private val DEFAULT_DELIMITER_REGEX = ",|:"

    fun parse(input: String): Pair<String, String> {
        return if (input.startsWith(CUSTOM_PREFIX)) {
            parseCustomDelimiter(input)
        } else {
            DEFAULT_DELIMITER_REGEX to input
        }
    }

    private fun parseCustomDelimiter(input: String): Pair<String, String> {
        val normalizedInput = input.replace("\\n", "\n")

        val endOfDelimiterIndex = normalizedInput.indexOf('\n')
        if (endOfDelimiterIndex == -1) {
            throw IllegalArgumentException("커스텀 구분자 형식이 잘못되었습니다.")
        }

        val delimiter = normalizedInput.substring(CUSTOM_PREFIX.length, endOfDelimiterIndex)
        val numbersPart = normalizedInput.substring(endOfDelimiterIndex + 1)
        return Regex.escape(delimiter) to numbersPart
    }
}
