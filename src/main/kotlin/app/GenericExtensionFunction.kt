package app

/**
 * Generic Extension Function
 *
 * Generic juga bisa digunakan pada extension function.
 * Dengan begitu kita bisa memilih jenis generic parameter
 * type apa yang bisa menggunakan extension function tersebut
 */

class Data<T>(val param: T)

fun Data<String>.print() {
    val string = this.param
    println(string)
}


fun main() {
    val data1 = Data<String>("Linux")
    val data2 = Data<Int>(2)

    data1.print()
//    data2.print() // error
}