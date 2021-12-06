package app

/**
 * Star Projection
 *
 * Misal kita hanya ingin mengambil panjang
 * data Array<T>, dan kita tidak peduli dengan
 * isi data T nya
 *
 * Keywordnya adalah '*'
 */

fun displayLength(array: Array<*>) {
    println("Total array is ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1,2,3,4,5)
    val arrayString: Array<String> = arrayOf("Cornelius","Linux")

    displayLength(arrayInt)
    displayLength(arrayString)
}