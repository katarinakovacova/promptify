/**
 * Prompt script for optimizing a given code snippet:
 *
 * "Analyze the provided code and optimize it. The response should include:
 * 1. A modified, optimized version of the code with improvements in efficiency, readability, or performance.
 * 2. An explanation of the optimization choices, detailing how they enhance the code’s functionality and reduce resource usage or execution time.
 * 3. A brief summary of the benefits of the optimized code, mentioning any trade-offs if applicable.
 *
 * Include comments within the code to highlight key changes and provide a short, clear comparison between the original and optimized versions."
 *
 */

fun findPrimesUpTo(n: Int): List<Int> {
    val primes = mutableListOf<Int>()
    for (i in 2..n) {
        var isPrime = true
        for (j in 2 until i) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            primes.add(i)
        }
    }
    return primes
}

/*
Problem Explanation:
This unoptimized version of the code checks all possible divisors for each number to determine if it is prime. This approach is inefficient because:
1. For each number `i`, it checks divisibility by all numbers from `2` up to `i - 1`, leading to many unnecessary checks.
2. The computational complexity is high, as each number performs multiple checks, making the algorithm slow for large inputs.
*/

fun findPrimesUpToOptimized(n: Int): List<Int> {
    val primes = mutableListOf<Int>()
    for (i in 2..n) {
        var isPrime = true
        val sqrtI = kotlin.math.sqrt(i.toDouble()).toInt()
        for (prime in primes) {
            if (prime > sqrtI) break
            if (i % prime == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            primes.add(i)
        }
    }
    return primes
}

/*
Optimization Benefits:
- Faster Computation: By checking divisibility only up to the square root of `i`, we reduce the number of operations needed, resulting in faster performance, especially for larger numbers.
- Efficient Use of Previously Found Primes: The optimized code leverages previously found primes to reduce the need for additional divisibility checks, which lowers the complexity of the algorithm.

This optimization improves performance significantly in cases where a large range of prime numbers needs to be calculated.
*/

fun main() {
    val n = 50
    println("Unoptimized primes up to $n: ${findPrimesUpTo(n)}")
    println("Optimized primes up to $n: ${findPrimesUpToOptimized(n)}")
}
