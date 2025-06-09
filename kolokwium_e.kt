// Funkcja pomocnicza do obliczania największego wspólnego dzielnika (NWD)
// Używana do skracania ułamków. Bazuje na algorytmie Euklidesa.
fun gcd(a: Int, b: Int): Int {
    // Jeśli b == 0, to NWD to a (koniec rekursji)
    return if (b == 0) a else gcd(b, a % b)
}

// Funkcja, która przyjmuje dwa ułamki jako ciągi znaków (np. "1/4", "1/2")
// i zwraca ich sumę w postaci uproszczonego ułamka (również jako String)
fun addFractions(fraction1: String, fraction2: String): String {
    // Rozdzielamy pierwszy ułamek na licznik i mianownik, np. "1/4" -> 1 i 4
    val (num1, den1) = fraction1.split("/").map { it.toInt() }

    // Rozdzielamy drugi ułamek na licznik i mianownik, np. "1/2" -> 1 i 2
    val (num2, den2) = fraction2.split("/").map { it.toInt() }

    // Obliczamy wspólny mianownik przez mnożenie (den1 * den2)
    val wspolnyMianownik = den1 * den2

    // Obliczamy nowy licznik:
    // Przekształcamy oba ułamki do wspólnego mianownika
    val nowyLicznik = num1 * den2 + num2 * den1

    // Skracamy ułamek - obliczamy największy wspólny dzielnik (NWD)
    val dzielnik = gcd(kotlin.math.abs(nowyLicznik), wspolnyMianownik)

    // Dzielimy licznik i mianownik przez NWD
    val licznikSkrocony = nowyLicznik / dzielnik
    val mianownikSkrocony = wspolnyMianownik / dzielnik

    // Zwracamy wynik jako tekst w postaci "a/b"
    return "$licznikSkrocony/$mianownikSkrocony"
}

// Klasa, która reprezentuje dodawanie ułamków przekazanych jako Stringi
class FractionAdder(private val fraction1: String, private val fraction2: String) {

    // Metoda dodająca dwa ułamki i zwracająca wynik jako String
    fun addFractions(): String {
        // Rozdzielamy pierwszy ułamek
        val (num1, den1) = fraction1.split("/").map { it.toInt() }

        // Rozdzielamy drugi ułamek
        val (num2, den2) = fraction2.split("/").map { it.toInt() }

        // Liczymy wspólny mianownik
        val wspolnyMianownik = den1 * den2

        // Liczymy nowy licznik
        val nowyLicznik = num1 * den2 + num2 * den1

        // Skracamy wynik
        val dzielnik = gcd(kotlin.math.abs(nowyLicznik), wspolnyMianownik)
        val licznikSkrocony = nowyLicznik / dzielnik
        val mianownikSkrocony = wspolnyMianownik / dzielnik

        // Zwracamy ułamek jako String
        return "$licznikSkrocony/$mianownikSkrocony"
    }
}

// Funkcja główna - tutaj program się uruchamia
fun main() {
    // Przykładowe dane wejściowe
    val u1 = "1/42"
    val u2 = "111/22"

    // Użycie funkcji niezależnej
    val wynikFunkcji = addFractions(u1, u2)
    println("Suma (funkcja): $wynikFunkcji")  // Oczekiwany wynik: 3/4

    // Użycie klasy z metodą
    val adder = FractionAdder(u1, u2)
    val wynikKlasy = adder.addFractions()
    println("Suma (klasa): $wynikKlasy")      // Oczekiwany wynik: 3/4
}
