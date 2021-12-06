package app

import data.MyData

fun main() {
    val myData: MyData<String, Int> = MyData<String, Int>("Linux", 123)
    myData.printlnData()

    val myDataInt: MyData<Int, Float> = MyData(2, 5.1f)
    myDataInt.printlnData()
}