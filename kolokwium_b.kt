// Funkcja, która przyjmuje oryginalny ciąg tekstowy oraz znak separatora,
// i zwraca nowy ciąg, gdzie litery oryginału są rozdzielone podanym znakiem
fun divideStringWithSymbol(original: String, symbol: String): String {
    // Zamieniamy oryginalny string na listę znaków, następnie łączymy je znakiem separatora
    // Przykład: "nisp" + "_" -> "n_i_s_p"
    return original.toCharArray().joinToString(separator = symbol)
}

// Klasa reprezentująca dzielnik tekstu
class StringDivider(private val original: String) {
    // Metoda przyjmująca symbol i zwracająca nowy ciąg,
    // w którym litery oryginalnego tekstu są rozdzielone tym symbolem
    fun divideWithSymbol(symbol: String): String {
        // To samo co w funkcji wyżej, ale jako metoda klasy operująca na polu original
        return original.toCharArray().joinToString(separator = symbol)
    }
}

// Przykładowe użycie programu
fun main() {
    // Przykładowy tekst
    val word = "nisp"
    // Przykładowy znak separatora
    val separator = "_"

    // Użycie funkcji
    val resultFromFunction = divideStringWithSymbol(word, separator)
    println("Wynik funkcji: $resultFromFunction")  // Output: n_i_s_p

    // Użycie klasy
    val divider = StringDivider(word)
    val resultFromClass = divider.divideWithSymbol(separator)
    println("Wynik klasy: $resultFromClass")       // Output: n_i_s_p
}









/*
// Funkcja, która ręcznie tworzy nowy ciąg, rozdzielając litery oryginału podanym znakiem
fun divideStringWithSymbol(original: String, symbol: String): String {
    // Tworzymy pusty łańcuch znaków, w którym będziemy budować wynik
    var result = ""

    // Iterujemy po każdym znaku w oryginalnym ciągu
    for (i in 0 until original.length) {
        // Dodajemy znak do wyniku
        result += original[i]

        // Jeżeli to nie jest ostatni znak, dodajemy także separator
        if (i < original.length - 1) {
            result += symbol
        }
    }

    // Zwracamy zbudowany ciąg znaków
    return result
}

// Klasa, która przechowuje oryginalny ciąg tekstowy i rozdziela go symbolem
class StringDivider(private val original: String) {

    // Metoda, która ręcznie dzieli tekst znakiem
    fun divideWithSymbol(symbol: String): String {
        var result = ""

        // Iterujemy przez oryginalny tekst
        for (i in 0 until original.length) {
            result += original[i]

            // Dodajemy symbol tylko jeśli to nie jest ostatnia litera
            if (i < original.length - 1) {
                result += symbol
            }
        }

        return result
    }
}

// Przykład użycia
fun main() {
    // Przykładowy ciąg wejściowy
    val word = "nisp"
    // Przykładowy separator
    val separator = "_"

    // Użycie funkcji
    val resultFromFunction = divideStringWithSymbol(word, separator)
    println("Wynik funkcji: $resultFromFunction")  // Output: n_i_s_p

    // Użycie klasy
    val divider = StringDivider(word)
    val resultFromClass = divider.divideWithSymbol(separator)
    println("Wynik klasy: $resultFromClass")       // Output: n_i_s_p
}



*/




