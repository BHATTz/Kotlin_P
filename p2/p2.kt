//Kotlin Program to Sort a Map By Values

// fun main() {
//     val unsortedMap = mapOf("b" to 3, "a" to 1, "c" to 2) // unsorted map
//     val sortedMap = unsortedMap.toList().sortedBy { (_, value) -> value }.toMap() // sorted map
//     println(sortedMap)
// }


//Kotlin Program to Convert List (ArrayList) to Array and Vice-Versa
//Convert ArrayList to Array

// fun main() {
//   var arrayList = arrayListOf("apple", "banana", "cherry", "data")
//   var array = arrayList.toTypedArray()
//   println(array.contentToString())
// }

//Convert Array to ArrayList

// fun main() {
//     val array = arrayOf("apple", "banana", "orange", "kiwi")
//     val arrayList = ArrayList(array.toList())
//     println("$arrayList")
// }


//Using class a Kotlin program to Calculate Difference Between Two Time Periods

import java.time.LocalTime
import java.time.Duration

class TimePeriod(val start: LocalTime, val end: LocalTime) {
    fun getDuration(): Duration {
        return Duration.between(start, end)
    }
}

fun main() {
    val period1 = TimePeriod(LocalTime.of(10, 0), LocalTime.of(12, 0))
    val period2 = TimePeriod(LocalTime.of(13, 0), LocalTime.of(15, 30))

    val duration1 = period1.getDuration()
    val duration2 = period2.getDuration()

    val difference = duration1.minus(duration2)

    println("Duration of period 1: $duration1")
    println("Duration of period 2: $duration2")
    println("Difference between periods: $difference")
}

