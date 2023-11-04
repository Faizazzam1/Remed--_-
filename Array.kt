package remed

fun main() {
    //Buat contoh array min. 20 lalu print
    val Animal : Array<String> = arrayOf(
    "Lion",
    "Tiger",
    "Shark",
    "Bird",
    "Pig",
    "Rabbit",
    "Snake",
    "Whale",
    "Dragon",
    "Dog",
    "Mammoth",
    "Cat",
    "Eagle",
    "Scorpion",
    "Snail",
    "Monkey",
    "Simpanse",
    "Elephant",
    "Chicken",
    "Turtle",
    )
    Animal.forEachIndexed { index, animal ->
        println(" ${animal}")
    }
}