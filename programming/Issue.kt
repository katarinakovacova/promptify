import java.util.Scanner

/*
Prompt script for issue creation:
Write an issue for a Kotlin program that converts temperatures between Celsius and Fahrenheit. The issue should include:
1. A brief summary of the program’s purpose.
2. Detailed tasks that the program should accomplish, such as user input, conversion, and error handling.
3. Expected program output with an example if possible.
Format this issue as a Markdown code for posting to GitHub.
*/

/*
Issue:
Create a Kotlin program that converts temperatures between Celsius and Fahrenheit.
The program should:
1. Prompt the user to select the conversion type (Celsius to Fahrenheit or Fahrenheit to Celsius).
2. Accept temperature input from the user in the chosen scale.
3. Perform the conversion using the correct formula.
4. Display the converted temperature to the user.
5. Include error handling for invalid choices.

Expected Output:
The program should print the converted temperature based on the user's selection.

*/

fun main() {
    val scanner = Scanner(System.`in`)

    println("Select the conversion type:")
    println("1: Celsius to Fahrenheit")
    println("2: Fahrenheit to Celsius")
    val choice = scanner.nextInt()

    when (choice) {
        1 -> {
            println("Enter temperature in Celsius:")
            val celsius = scanner.nextDouble()
            val fahrenheit = (celsius * 9 / 5) + 32
            println("Temperature in Fahrenheit is: $fahrenheit")
        }
        2 -> {
            println("Enter temperature in Fahrenheit:")
            val fahrenheit = scanner.nextDouble()
            val celsius = (fahrenheit - 32) * 5 / 9
            println("Temperature in Celsius is: $celsius")
        }
        else -> println("Invalid choice. Please try again.")
    }
}

/**
Documentation:
This Kotlin program converts temperature between Celsius and Fahrenheit based on the user's selection.

Functions:
- main: The primary function which prompts the user for input, performs the conversion, and outputs the result.

Conversion formulas:
- Celsius to Fahrenheit: (°C * 9/5) + 32
- Fahrenheit to Celsius: (°F - 32) * 5/9

User input:
- User selects 1 to convert Celsius to Fahrenheit.
- User selects 2 to convert Fahrenheit to Celsius.
- If an invalid option is selected, an error message is displayed.

Example usage:
- Selecting option 1 and entering 25 (Celsius) will output: "Temperature in Fahrenheit is: 77.0".
- Selecting option 2 and entering 77 (Fahrenheit) will output: "Temperature in Celsius is: 25.0".
*/
