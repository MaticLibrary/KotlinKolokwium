/*
Napisz program, który przyjmuje ułamek, odwraca go i upraszcza.
*/
fun nwd(a: Int, b: Int): Int {
    var x = if (a < 0) -a else a
    var y = if (b < 0) -b else b
    while (y != 0) {
        val r = x % y
        x = y
        y = r
    }
    return x
}

fun tekstNaLiczbe(tekst: String): Int {
    var liczba = 0
    var i = 0
    while (i < tekst.length) {
        liczba = liczba * 10 + (tekst[i] - '0')
        i++
    }
    return liczba
}

fun odwrocIUprosc(tekst: String): String {
    var slash = -1
    for (i in tekst.indices) {
        if (tekst[i] == '/') {
            slash = i
            break
        }
    }
    val licznik = tekstNaLiczbe(tekst.substring(0, slash))
    val mianownik = tekstNaLiczbe(tekst.substring(slash + 1))

    val nowyLicznik = mianownik
    val nowyMianownik = licznik
    val wsp = nwd(nowyLicznik, nowyMianownik)

    return "${nowyLicznik / wsp}/${nowyMianownik / wsp}"
}

fun main() {
    println("Podaj ułamek:")
    val wejscie = readLine() ?: ""
    println("Odwrotność i uproszczenie: ${odwrocIUprosc(wejscie)}")
}
