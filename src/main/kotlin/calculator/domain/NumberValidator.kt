package calculator.domain

object NumberValidator {

    fun validate(value: String): Int {
        return value.toIntOrNull()?.takeIf { it >= 0 }
            ?: throw IllegalArgumentException(INVALID_NUMBER_ERROR)
    }

    private const val INVALID_NUMBER_ERROR = "음수 또는 숫자가 아닌 값이 입력되었습니다."
}
