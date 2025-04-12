package calculator.view

object OutputView {
    private const val INTRO_MESSAGE = "덧셈할 문자열을 입력해 주세요."
    private const val RESULT_MESSAGE_PREFIX = "결과 : "

    fun printIntroMessage() {
        println(INTRO_MESSAGE)
    }

    fun printResult(result: Int) {
        println("$RESULT_MESSAGE_PREFIX$result")
    }
}