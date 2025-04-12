package calculator

import calculator.domain.StringCalculator
import calculator.view.InputView
import calculator.view.OutputView

fun main() {
    OutputView.printIntroMessage()
    val input = InputView.input()
    val result = StringCalculator().calculate(input)
    OutputView.printResult(result)
}
