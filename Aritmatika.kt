package remed

fun main() {
    //Buat rumus untuk menghitung aritmatka menggunakan range
    val Penyelesaian = 6..51 step 5
    var V = 0
    Penyelesaian.forEachIndexed { index, angka->
        println(" nilai ke ${index + 1} adalah $angka")
    }
}