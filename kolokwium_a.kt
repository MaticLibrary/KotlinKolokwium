fun getDivisors(n: Int): List<Int> {
    val divisors = mutableListOf<Int>()
    for (i in 1..kotlin.math.abs(n)) {
        if (n % i == 0) {
            divisors.add(i)
            divisors.add(-i)
        }
    }
    return divisors.distinct().sorted()
}

fun main() {
    print("Podaj liczbę całkowitą: ")
    val input = readLine()

    val number = input?.toIntOrNull()
    if (number == null) {
        println("To nie jest poprawna liczba całkowita!")
        return
    }

    // Użycie funkcji
    val divisorsFromFunction = getDivisors(number)
    println("Dzielniki liczby $number (funkcja): $divisorsFromFunction")

    // Użycie klasy
    val calculator = DivisorsCalculator(number)
    val divisorsFromClass = calculator.calculateDivisors()
    println("Dzielniki liczby $number (klasa): $divisorsFromClass")
}

class DivisorsCalculator(private val number: Int) {
    fun calculateDivisors(): List<Int> {
        val divisors = mutableListOf<Int>()
        for (i in 1..kotlin.math.abs(number)) {
            if (number % i == 0) {
                divisors.add(i)
                divisors.add(-i)
            }
        }
        return divisors.distinct().sorted()
    }
}
