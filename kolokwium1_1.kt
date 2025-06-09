/*
Napisz program w Kotlinie, który przyjmuje ułamek w postaci tekstu (np. "3/4") i zwraca jego odwrotność (czyli "4/3").
Napisz funkcję i klasę OdwrotnyUlamek z metodą odwroc().
*/


// Funkcja zamieniająca miejscami licznik i mianownik w ułamku
fun odwrocUlamek(tekstUlamek: String): String {
    var indeksSlasha = -1
    for (i in tekstUlamek.indices) {
        if (tekstUlamek[i] == '/') {
            indeksSlasha = i
            break
        }
    }

    val licznik = tekstUlamek.substring(0, indeksSlasha)
    val mianownik = tekstUlamek.substring(indeksSlasha + 1)

    return "$mianownik/$licznik"
}

// Klasa z metodą odwroc() robiącą to samo
class OdwrotnyUlamek(private val tekstUlamek: String) {
    fun odwroc(): String {
        var indeksSlasha = -1
        for (i in tekstUlamek.indices) {
            if (tekstUlamek[i] == '/') {
                indeksSlasha = i
                break
            }
        }
        val licznik = tekstUlamek.substring(0, indeksSlasha)
        val mianownik = tekstUlamek.substring(indeksSlasha + 1)

        return "$mianownik/$licznik"
    }
}

fun main() {
    println("Podaj ułamek (np. 3/4):")
    val wejscie = readLine() ?: ""
    println("Odwrotność (funkcja): ${odwrocUlamek(wejscie)}")
    println("Odwrotność (klasa): ${OdwrotnyUlamek(wejscie).odwroc()}")
}
