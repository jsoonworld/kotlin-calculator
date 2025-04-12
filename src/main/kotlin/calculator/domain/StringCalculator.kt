package calculator.domain

class StringCalculator {
    fun calculate(input: String): Int{
        if(input.isBlank()) return 0

        val(delimeter, numbersPart) = DelimiterParser.parse(input)
        val tokens = numbersPart.split(Regex(delimeter))

        val numbers = tokens.map{
            it.toIntOrNull()?.takeIf { n -> n >= 0}
                ?: throw IllegalArgumentException("음수 또는 숫자가 아닌 값이 입력되었습니다.")
        }

        return numbers.sum()
    }
}