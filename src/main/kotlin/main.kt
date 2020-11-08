import java.io.File

object Main {
    val program: WProgram = WspParser.program.parse(File("input.wsp").readText())
}

fun main(args: Array<String>) {
    Main.program.eval()
}