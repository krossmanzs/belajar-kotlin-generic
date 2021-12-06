package app

/**
 * Type Projection
 *
 * menambahkan informasi covariant atau contravariant
 * di parameter function, ini memaksa isi function
 * melakukan pengecekan:
 *
 * Jika covariant, kita tidak boleh mengubah data generic
 * di object
 *
 * Jika contravariant, kita tidak boleh mengambil data
 * generic di object
 */

class Container<T>(var data: T)

fun copyContainer(from: Container<out Any>, to: Container<in Any>) {
    to.data = from.data
}

fun main() {
    val container1 = Container("Cornelius")
    val container2: Container<Any> = Container("Linux")

    copyContainer(container1,container2)
    println("""
        $container1
        $container2
    """.trimIndent())
}