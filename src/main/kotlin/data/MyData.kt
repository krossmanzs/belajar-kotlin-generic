package data

class MyData<T, U>(val firstData: T, val secondData: U) {
    fun printlnData() {
        println("Data is $firstData $secondData")
    }

    fun getFirst(): T = firstData

    fun getSecond(): U = secondData
}