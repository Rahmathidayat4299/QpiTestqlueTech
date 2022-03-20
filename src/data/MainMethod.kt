package data

fun main() {
    println("QPI Test Section One")

    val sectionA = arrayOf(1, 6, 3, 5, 8, 7, 4, 20)
    println("Input")
    sectionA.forEach { print("$it") }
    println()
    println("Answer Output ${AscendingforA(sectionA).contentToString()}")


    val sectionB = arrayOf(1, 2, 3, 4, 5, 6)
    println("Input")
    sectionB.forEach { print("$it") }
    println()
    println(" Answer Output ${sortingTwo(sectionB).contentToString()}")

    val sectionC = arrayOf(10, 33, 13, 72, 44, 51, 17)
    println("Input")
    sectionC.forEach { print("$it") }
    println()
    println("Answer Output ${sortingThree(sectionC).contentToString()}")
}