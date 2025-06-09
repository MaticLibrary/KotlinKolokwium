Treść:
Napisz program, który sprawdza czy podany ułamek (np. "3/5", "9/2") jest właściwy (czyli czy licznik < mianownik).

fun tekstNaLiczbe(tekst: String): Int {
    var liczba = 0
    var i = 0
    var znak = 1
    if (tekst[0] == '-') {
        znak = -1
        i = 1
    }
    while (i < tekst.length) {
        liczba = liczba * 10 + (tekst[i] - '0')
        i++
    }
    return liczba * znak
}

fun czyWlasciwy(tekstUlamek: String): Boolean {
    var slash = -1
    for (i in tekstUlamek.indices) {
        if (tekstUlamek[i] == '/') {
            slash = i
            break
        }
    }
    val licznik = tekstNaLiczbe(tekstUlamek.substring(0, slash))
    val mianownik = tekstNaLiczbe(tekstUlamek.substring(slash + 1))
    return licznik < mianownik
}

class SprawdzaczUlamka(val tekstUlamek: String) {
    fun czyWlasciwy(): Boolean {
        var slash = -1
        for (i in tekstUlamek.indices) {
            if (tekstUlamek[i] == '/') {
                slash = i
                break
            }
        }
        val licznik = tekstNaLiczbe(tekstUlamek.substring(0, slash))
        val mianownik = tekstNaLiczbe(tekstUlamek.substring(slash + 1))
        return licznik < mianownik
    }
}

fun main() {
    println("Podaj ułamek:")
    val wejscie = readLine() ?: ""
    println("Czy ułamek jest właściwy (funkcja)? ${czyWlasciwy(wejscie)}")
    println("Czy ułamek jest właściwy (klasa)? ${SprawdzaczUlamka(wejscie).czyWlasciwy()}")
}
