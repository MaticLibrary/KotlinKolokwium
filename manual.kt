fun main() {
    // ======= PARSOWANIE STRINGA DO INT I DOUBLE =======

    val tekstLiczby = "123"
    val liczbaCalkowita = tekstLiczby.toInt() // Konwersja tekstu "123" na liczbę całkowitą
    println("Liczba całkowita: $liczbaCalkowita")

    val tekstZmiennoprzecinkowy = "45.67"
    val liczbaZmiennoprzecinkowa = tekstZmiennoprzecinkowy.toDouble() // Konwersja na Double
    println("Liczba zmiennoprzecinkowa: $liczbaZmiennoprzecinkowa")

    // ======= DZIELENIE STRINGA PO ZNAKU =======

    val ulamek = "1245/643"
    val czesci = ulamek.split("/") // Dzieli string na dwie części: "1245" i "643"
    val licznik = czesci[0].toInt() // Parsuje pierwszą część na liczbę
    val mianownik = czesci[1].toInt() // Parsuje drugą część
    println("Licznik: $licznik, Mianownik: $mianownik")

    // ======= USUWANIE BIAŁYCH ZNAKÓW =======

    val zBialymiZnakami = "   tekst   "
    val bezBialych = zBialymiZnakami.trim() // Usuwa spacje z początku i końca
    println("Bez białych znaków: '$bezBialych'")

    // ======= SPRAWDZANIE ZAWARTOŚCI STRINGA =======

    val tekst = "programowanie w Kotlinie"
    println("Czy zawiera 'Kotlin'? ${tekst.contains("Kotlin")}")
    println("Czy zaczyna się na 'prog'? ${tekst.startsWith("prog")}")
    println("Czy kończy się na 'nie'? ${tekst.endsWith("nie")}")

    // ======= ITEROWANIE PO ZNAKACH STRINGA =======

    val slowo = "abc"
    for (znak in slowo) {
        println("Znak: $znak")
    }

    // ======= TWORZENIE LISTY Z STRINGA =======

    val tekstZListy = "1,2,3,4,5"
    val lista = tekstZListy.split(",") // ["1", "2", "3", "4", "5"]
    val listaIntow = lista.map { it.toInt() } // Zamiana na listę liczb
    println("Lista Intów: $listaIntow")

    // ======= ZAMIANA STRINGA NA CHAR ARRAY I STRING ARRAY =======

    val napis = "test"
    val znaki = napis.toCharArray() // ['t', 'e', 's', 't']
    val znakiJakoString = napis.map { it.toString() } // ["t", "e", "s", "t"]
    println("Znaki jako char: ${znaki.joinToString()}")
    println("Znaki jako stringi: $znakiJakoString")

    // ======= KONKATENACJA STRINGÓW =======

    val a = "Kotlin"
    val b = " jest super"
    val polaczone = a + b // Łączenie dwóch stringów
    println("Połączony tekst: $polaczone")

    // ======= FORMATOWANIE STRINGÓW =======

    val imie = "Ala"
    val wiek = 18
    val komunikat = "Imię: $imie, Wiek: $wiek"
    println(komunikat)

    // ======= MAPA STRING -> INT =======

    val mapa = mapOf("jeden" to 1, "dwa" to 2)
    println("Mapa: $mapa")
    println("Wartość dla 'dwa': ${mapa["dwa"]}")

    // ======= FUNKCJE NA STRINGACH =======

    val oryginalny = "Kotlin jest piękny"
    val zamieniony = oryginalny.replace("piękny", "świetny")
    println("Po zamianie: $zamieniony")

    val duzeLitery = oryginalny.uppercase()
    val maleLitery = oryginalny.lowercase()
    println("Duże litery: $duzeLitery")
    println("Małe litery: $maleLitery")

    // ======= DŁUGOŚĆ STRINGA =======

    val przyklad = "123456"
    println("Długość ciągu: ${przyklad.length}")

    // ======= KONWERSJA LICZBY NA STRING =======

    val liczba = 42
    val tekstZLiczby = liczba.toString()
    println("Tekst z liczby: $tekstZLiczby")

    // ======= ZCZYTYWANIE DANYCH OD UŻYTKOWNIKA =======

    print("Wpisz swoje imię: ")
    val imieUzytkownika = readLine() ?: ""
    println("Witaj, $imieUzytkownika!")

    // ======= OBSŁUGA WYJĄTKÓW PODCZAS PARSOWANIA =======

    print("Podaj liczbę: ")
    val wejscie = readLine()
    try {
        val liczbaWejscie = wejscie?.toInt() ?: 0
        println("Podałeś liczbę: $liczbaWejscie")
    } catch (e: NumberFormatException) {
        println("To nie była liczba!")
    }

    // ======= DZIELENIE STRINGA NA ZNAKI I ŁĄCZENIE Z SYMBOLEM =======

    val slowoDoPodzialu = "KOTLIN"
    val znakRozdzielajacy = "-"
    var nowyTekst = ""
    for (i in slowoDoPodzialu.indices) {
        nowyTekst += slowoDoPodzialu[i]
        if (i != slowoDoPodzialu.length - 1) {
            nowyTekst += znakRozdzielajacy
        }
    }
    println("Nowy tekst z separatorami: $nowyTekst")
}

/*
// Funkcja usuwająca wszystkie wystąpienia podanych znaków z tekstu
fun usunZnaki(tekst: String, znakiDoUsuniecia: String): String {
    var wynik = ""  // Pusty string, w którym będziemy budować wynikowy tekst
    // Przechodzimy po każdym znaku w tekście
    for (znak in tekst) {
        // Jeśli znak NIE znajduje się w ciągu znaków do usunięcia, dodajemy go do wyniku
        if (!znakiDoUsuniecia.contains(znak)) {
            wynik += znak
        }
    }
    return wynik
}

fun main() {
    // Przykład 1: usuwanie wszystkich '-' ze stringa "a-s-d-f-g-h"
    val tekst1 = "a-s-d-f-g-h"
    val wynik1 = usunZnaki(tekst1, "-")  // Usuwamy znak '-'
    println("Po usunięciu '-': $wynik1")  // Wypisze: asdfgh

    // Przykład 2: usuwamy kilka znaków, np. 'a', 's', 'g'
    val tekst2 = "abrakadabra"
    val znakiDoUsuniecia2 = "asg"
    val wynik2 = usunZnaki(tekst2, znakiDoUsuniecia2)
    println("Po usunięciu '$znakiDoUsuniecia2' z '$tekst2' zostaje: $wynik2")  // wypisze: brkdbra
}

*/



