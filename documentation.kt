import kotlin.random.Random
import java.io.File

/**
 * Generates a random integer between 1 and 99 and outputs it either to the console or to a file.
 *
 * @param outputToFile If `true`, the generated number is saved to a file named `randomNumber.txt`.
 *                     If `false`, the generated number is printed to the console.
 *
 * The output file will be created in the current working directory. If the output is directed to the file,
 * the file path will be printed to the console.
 *
 * Example usage:
 * ```
 * generateRandomNumber(outputToFile = false) // Outputs to console
 * generateRandomNumber(outputToFile = true)  // Outputs to file
 * ```
 */
fun generateRandomNumber(outputToFile: Boolean) {
    val randomNumber = Random.nextInt(1, 100) // Generates a random number from 1 to 99

    if (outputToFile) {
        val file = File("randomNumber.txt")
        file.writeText("Generated random number: $randomNumber")
        println("Random number written to file: ${file.absolutePath}")
    } else {
        println("Generated random number: $randomNumber")
    }
}

fun main() {
    generateRandomNumber(outputToFile = false)
    generateRandomNumber(outputToFile = true)
}
