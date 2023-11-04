package remed

fun main() {
    //print
    //  "Saya lapar sekali, minjem 100 dong buat makan hari ini" 600 kali
    // GUNAKAN RANGE
    val Lapar = 1..600
    var S = 0
    Lapar.forEachIndexed { Index, lapar ->
        println(" ${Index + 1} Saya lapar sekali, minjem 100 dong buat makan hari ini")
    }
}