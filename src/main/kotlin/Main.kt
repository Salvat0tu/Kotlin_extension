fun main(args: Array<String>) {
    val numList = listOf(1,22,14,23,56,11,2,4)
    println("Lista di numeri non filtrata : $numList")
    val numLessThan20 = numList.filterSmallBy20()
    println("I numeri minori di 20 sono : $numLessThan20")

}

fun List<Int>.filterSmallBy20():List<Int> {
    return this.filter { num ->
        num < 20
    }
}