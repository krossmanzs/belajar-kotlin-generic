package app

/**
 * Contravariant (kebalikan covariant)
 *
 * Artinya kita bisa melakukan subtitusi
 * supertype (Parent) dengan subtype (child)
 *
 * Hanya jenis function dalam class yang bisa
 * menggunakan covariant generic parameter
 *
 * Contoh<Any> bisa disubtitusikan menjadi
 * Contoh<String>
 *
 * kata kunci contravariant adalah 'in'
 */

class ContraVariant<in T> {
    fun sayHello(param: T) {
        println("Hello $param")
    }

//    Tidak Boleh
//    fun getData(): T {
//        return data
//    }
}

fun main() {
    val contraVariantAny = ContraVariant<Any>()
    val contraVariantString: ContraVariant<String> = contraVariantAny

//    contraVariantString.getData() tidak boleh
    contraVariantString.sayHello("Linux")
}