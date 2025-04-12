package calculator.view

class OutputView {

    companion object {
        private const val INTRO_MESSAGE =  "덧셈할 문자열을 입력해 주세요."
    }

    fun printIntroMessage() {
        println(INTRO_MESSAGE)
    }

}