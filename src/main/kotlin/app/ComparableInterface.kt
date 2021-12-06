package app

import data.Fruit

/**
 * Comparable Interface
 *
 * Digunakan untuk meng komparasi dua
 * buah object yang berbeda atau sama
 */

fun main() {
    val fruit1 = Fruit("Apel",5)
    val fruit2 = Fruit("Watermelon",2)

    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
}