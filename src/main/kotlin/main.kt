import java.io.File
import type.WValue
import source.WProgramParser
import scope.WFunctionScope

object Main {
    val scope: WFunctionScope
    val compiledCode: WValue
    init {
        scope = WFunctionScope()
        val file = File("example.wsp")
        compiledCode = WProgramParser(file.absolutePath).parseAsProgram(file.readText())
                .eval(scope)
    }
}

fun main(args: Array<String>) {
    Main.compiledCode.eval(Main.scope)
}