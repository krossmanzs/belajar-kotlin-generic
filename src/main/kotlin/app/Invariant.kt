package app

/**
 * Invariant
 *
 * Defaultnya, generic parameter type
 * bersifat invariant
 *
 * Artinya tidak boleh di subtitusi dengan
 * subtype (child) atau supertype (Parent)
 *
 * Contoh<String> != Contoh<Any>
 *     atau
 * Contoh<Any> != Contoh<String>
 */

data class Invariant<T>(val data:T)

fun main() {
    val invariantString: Invariant<String> = Invariant("Eko")
//    val invariantInt: Invariant<String> = data1 // error
    // Type mismatch: inferred type is Invariant<String> but Invariant<Any> was expected
}