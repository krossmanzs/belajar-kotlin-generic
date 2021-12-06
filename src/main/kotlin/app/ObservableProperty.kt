package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

/**
 * ObservableProperty Class
 *
 * Pada ReadOnlyProperty dan ReadWriteProperty
 * kita perlu mengatur value datanya secara manual
 *
 * Kita bisa menggunakan ObservableProperty
 * untuk melakukan sesuatu sebelum dan setelah data
 * nya diubah
 *
 */

class LogObservableProperty<T>(param: T) : ObservableProperty<T>(param) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change ${property.name} from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int) {
    var brand: String by LogObservableProperty<String>(brand)
    var year: Int by LogObservableProperty<Int>(year)
    var owner: String by Delegates.notNull<String>()
    var description: String by Delegates.vetoable("") {
        property, oldValue, newValue ->
        println("Before change ${property.name} from $oldValue to $newValue")
        true
    }
    var other: String by Delegates.observable("") {
        property, oldValue, newValue ->
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

fun main() {
    val car = Car("Honda",2020)

    car.brand = "Kijang"
    println(car.brand)

    car.year = 2021
    println(car.year)

    car.owner = "Linux"
    println(car.owner)

    car.description = "Sebuah mobil"
    println(car.description)

    car.other = "Other"
    println(car.other)

}