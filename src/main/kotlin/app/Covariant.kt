package app

/**
 * Covariant
 *
 * Artinya kita bisa melakukan subtitusi
 * subtype (child) dengan supertype (Parent)
 *
 * Hanya jenis class generic yang menggunakan
 * generic parameter type sebagai return type
 * function
 *
 * Contoh<String> bisa disubtitusikan menjadi
 * Contoh<Any>
 *
 * kata kunci covariant adalah 'out'
 */

// jadi kita gabisa nerima input dari luar yang
// menggunakan generic parameter covariant
class Covariant<out T>(val data: T) {
    fun data(): T {
        return data
    }

//    Tidak boleh
//    fun setData(param: T) {
//        data = param
//    }
}

fun main() {
    val data1: Covariant<String> = Covariant("Linux")
    val data2: Covariant<Any> = data1

    // tidak boleh
//    covariantAny.setData(100)

    println("""
        ${data1.data}
        ${data2.data}
    """.trimIndent())
}