package app

import data.Function

/**
 * Generic Function
 *
 * Generic type juga bisa di
 * terapkan pada function.
 *
 * Generic parameter typenya
 * hanya bisa diakses di function
 * tersebut, tidak bisa digunakan
 * di luar function
 */

fun main() {
    val function = Function("Linux")

    function.sayHello<String>("Titot")
    function.sayHello(123)
}