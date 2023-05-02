// fun main() {
//   //val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
//   val theMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
//   println("The value for key two "+ theMap.get("two"))
//   println("The value for key two "+ theMap["two"])
//   if(theMap.isEmpty())
//   {
//       println(true)
//   }
//   else
//   {
//       println(false)
//   }
//   if(theMap.containsKey("two"))
//   {
//       println(true)
//   }
//   else
//   {
//       println(false)
//   }
//   if(theMap.containsValue(1))
//   {
//       println(true)
//   }
//   else
//   {
//       println(false)
//   }
//   println("Size of the Map "+theMap.size)
//   println("Size of the Map "+theMap.count())
//   theMap.put("five", 5)
//   println(theMap)
//   theMap["six"]=6
//   println(theMap)
//   theMap.remove("two")
//   println(theMap)
//   theMap.remove("three")
//   println(theMap)
//   theMap -= listOf("four")//remove
//   println(theMap)
//   var resultMap= theMap.toSortedMap()
//   println(resultMap)
// }


//#
// fun main() {
//   val myMap = hashMapOf<String, Int>()
//   myMap["one"] = 1
//   myMap["four"] = 4
//   myMap["two"] = 2
//   myMap["six"] = 6
//   myMap["three"] = 3
//   myMap["five"] = 5
//   println("My map:")
//   myMap.forEach { (k, v) -> 
//     println("$k => $v")
//   }
//   val sortedMap = myMap.toList().sortedBy { (k, v) -> v }.toMap()
//   println("Sorted map:")
//   sortedMap.forEach { (k, v) ->
//       println("$k => $v")
//   }
// }



//#
fun main() {
  val myMap = hashMapOf<String, String>()
  myMap["one"] = "sarthak"
  myMap["four"] = "Sharma"
  myMap["two"] = "Bhatt"
  myMap["six"] = "a"
  myMap["three"] = "Shubham"
  myMap["five"] = "s"
  println("My map:")
  myMap.forEach { (k, v) -> 
    println("$k => $v")
  }
  val sortedMap = myMap.toList().sortedBy{ (k, v) -> k }.toMap()
  println("Sorted map:")
  sortedMap.forEach { (k, v) ->
      println("$k => $v")
  }
}
