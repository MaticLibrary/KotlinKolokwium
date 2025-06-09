// Funkcja pomocnicza obliczająca największy wspólny dzielnik (NWD)
// Służy do skracania ułamków — klasyczny algorytm Euklidesa
fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

// Funkcja przyjmująca ułamek w formacie tekstowym, np. "4/8"
// i zwracająca uproszczony ułamek, np. "1/2"
fun simplifyFraction(fraction: String): String {
    // Dzielimy tekst po znaku "/" na dwie części: licznik i mianownik
    val parts = fraction.split("/")

    // Parsujemy obie części jako liczby całkowite
    val numerator = parts[0].toInt()
    val denominator = parts[1].toInt()

    // Obliczamy największy wspólny dzielnik licznika i mianownika
    val divisor = gcd(kotlin.math.abs(numerator), kotlin.math.abs(denominator))

    // Dzielimy licznik i mianownik przez NWD, aby skrócić ułamek
    val simplifiedNumerator = numerator / divisor
    val simplifiedDenominator = denominator / divisor

    // Składamy i zwracamy uproszczony ułamek jako tekst (np. "1/2")
    return "$simplifiedNumerator/$simplifiedDenominator"
}

// Klasa reprezentująca ułamek do uproszczenia
class FractionSimplifier(private val fraction: String) {

    // Metoda upraszczająca ułamek
    fun simplify(): String {
        // Dzielimy tekst ułamka na licznik i mianownik
        val parts = fraction.split("/")

        // Konwertujemy je na liczby całkowite
        val numerator = parts[0].toInt()
        val denominator = parts[1].toInt()

        // Obliczamy NWD
        val divisor = gcd(kotlin.math.abs(numerator), kotlin.math.abs(denominator))

        // Skracamy licznik i mianownik
        val simplifiedNumerator = numerator / divisor
        val simplifiedDenominator = denominator / divisor

        // Zwracamy wynik jako tekst w formacie "a/b"
        return "$simplifiedNumerator/$simplifiedDenominator"
    }
}

// Główna funkcja programu — punkt startowy
fun main() {
    // Przykład ułamka wejściowego
    val input = "124/5435"
    
    // Użycie funkcji
    val resultFromFunction = simplifyFraction(input)
    println("Wynik funkcji: $resultFromFunction")  // Przykład: 4/175

    // Użycie klasy
    val simplifier = FractionSimplifier(input)
    val resultFromClass = simplifier.simplify()
    println("Wynik klasy: $resultFromClass")       // Przykład: 4/175
}



/*
// Funkcja obliczająca największy wspólny dzielnik (NWD) dwóch liczb całkowitych
// Bazujemy na klasycznym algorytmie Euklidesa (rekurencyjnie)
fun najwiekszyWspolnyDzielnik(a: Int, b: Int): Int {
    var x = if (a < 0) -a else a  // Moduł z a
    var y = if (b < 0) -b else b  // Moduł z b

    while (y != 0) {
        val reszta = x % y
        x = y
        y = reszta
    }
    return x
}

// Funkcja pomocnicza do zamiany napisu na liczbę całkowitą (bez toInt())
fun tekstNaLiczbe(tekst: String): Int {
    var liczba = 0
    var znak = 1
    var i = 0

    // Obsługa liczb ujemnych
    if (tekst[0] == '-') {
        znak = -1
        i = 1
    }

    while (i < tekst.length) {
        val cyfra = tekst[i] - '0'
        liczba = liczba * 10 + cyfra
        i++
    }

    return liczba * znak
}

// Funkcja przyjmująca ułamek jako tekst i zwracająca uproszczony ułamek jako tekst
fun uproscUlamek(tekstUlamek: String): String {
    var indeksSlasha = -1

    // Szukamy ręcznie pozycji znaku "/"
    for (i in tekstUlamek.indices) {
        if (tekstUlamek[i] == '/') {
            indeksSlasha = i
            break
        }
    }

    // Wyodrębniamy licznik i mianownik jako osobne ciągi znaków
    val licznikTekst = tekstUlamek.substring(0, indeksSlasha)
    val mianownikTekst = tekstUlamek.substring(indeksSlasha + 1)

    // Zamieniamy licznik i mianownik z tekstu na liczby całkowite
    val licznik = tekstNaLiczbe(licznikTekst)
    val mianownik = tekstNaLiczbe(mianownikTekst)

    // Obliczamy NWD licznika i mianownika
    val nwd = najwiekszyWspolnyDzielnik(licznik, mianownik)

    // Dzielimy licznik i mianownik przez NWD, aby skrócić ułamek
    val licznikSkrocony = licznik / nwd
    val mianownikSkrocony = mianownik / nwd

    // Zwracamy wynik jako tekst w formacie "a/b"
    return "$licznikSkrocony/$mianownikSkrocony"
}

// Klasa reprezentująca uproszczenie ułamka
class UproszczaczUlamka(private val tekstUlamek: String) {

    // Metoda upraszczająca ułamek
    fun uprosc(): String {
        var indeksSlasha = -1

        // Ręczne znalezienie indeksu znaku "/"
        for (i in tekstUlamek.indices) {
            if (tekstUlamek[i] == '/') {
                indeksSlasha = i
                break
            }
        }

        val licznikTekst = tekstUlamek.substring(0, indeksSlasha)
        val mianownikTekst = tekstUlamek.substring(indeksSlasha + 1)

        val licznik = tekstNaLiczbe(licznikTekst)
        val mianownik = tekstNaLiczbe(mianownikTekst)

        val nwd = najwiekszyWspolnyDzielnik(licznik, mianownik)

        val licznikSkrocony = licznik / nwd
        val mianownikSkrocony = mianownik / nwd

        return "$licznikSkrocony/$mianownikSkrocony"
    }
}

// Główna funkcja programu (punkt startu)
fun main() {
    // Przykładowy ułamek do uproszczenia
    val wejscie = "124/5435"

    // Użycie funkcji
    val wynikFunkcja = uproscUlamek(wejscie)
    println("Wynik funkcji: $wynikFunkcja")

    // Użycie klasy
    val uproszczacz = UproszczaczUlamka(wejscie)
    val wynikKlasa = uproszczacz.uprosc()
    println("Wynik klasy: $wynikKlasa")
}



*/


