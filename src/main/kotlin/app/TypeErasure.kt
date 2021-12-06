package app

/**
 * Type Erasure
 *
 * Proses pengecekan generic pada saat
 * compile time, dan menghiraukan
 * pengecekan pada saat runtime
 *
 * Type Erasure menjadikan informasi generic
 * yang kita buat akan hilang ketika kode
 * program kita telah di compile menjadi
 * binary file
 *
 * Compiler akan mengubah generic parameter
 * type menjadi tipe Any (Object di java)
 */

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val data1 = TypeErasure<String>("Linux")
    val dataString: String = data1.getData()

//    error
//    val data2: TypeErasure<Int> = data1 as TypeErasure<Int>
//    val dataInt: Int = data2.getData()

    println("""
        $dataString
    """.trimIndent())
}