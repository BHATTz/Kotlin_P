//A) Armstrong Numbers Between Two Integers

// fun main() {
//     val a = 100
//     val b = 500

//     for (number in a + 1..b - 1) {
//         var n = 0
//         var result = 0
//         var on = number

//         // number of n calculation
//         while (on!= 0) {
//             on /= 10
//             ++n
//         }

//         on = number

//         // result contains sum of nth power of its n
//         while (on != 0) {
//             val remainder = on % 10
//             result += Math.pow(remainder.toDouble(), n.toDouble()).toInt()
//             on /= 10
//         }

//         if (result == number)
//             print("$number ")
//     }
// }

//B)Kotlin Program to Find all Roots of a Quadratic Equation

// fun main() {

//     val a = 2.3
//     val b = 4
//     val c = 5.6
//     val root1: Double
//     val root2: Double
//     val output: String

//     val determinant = b * b - 4.0 * a * c

//     // condition for real and different roots
//     if (determinant > 0) {
//         root1 = (-b + Math.sqrt(determinant)) / (2 * a)
//         root2 = (-b - Math.sqrt(determinant)) / (2 * a)

//         output = "root1 = %.2f and root2 = %.2f".format(root1, root2)
//     }
//     // Condition for real and equal roots
//     else if (determinant == 0.0) {
//         root2 = -b / (2 * a)
//         root1 = root2

//         output = "root1 = root2 = %.2f;".format(root1)
//     }
//     // If roots are not real
//     else {
//         val realPart = -b / (2 * a)
//         val imaginaryPart = Math.sqrt(-determinant) / (2 * a)

//         output = "root1 = %.2f+%.2fi and root2 = %.2f-%.2fi".format(realPart, imaginaryPart, realPart, imaginaryPart)
//     }

//     println(output)
// }

//C)Kotlin Program to Check if An Array Contains a Given Value

// fun main() {

//   val num = intArrayOf(1, 2, 3, 4, 5)
//   val toFind = 3
//   var found = false

//   for (n in num) {
//       if (n == toFind) {
//           found = true
//           break
//       }
//   }

//   if (found)
//       println("$toFind is found.")
//   else
//       println("$toFind is not found.")
// }


// sum of given array elements.

// import java.util.Scanner
// fun main() {
// var myArry = Array<Int>(5){0}
// var sum = 0
// val res = Scanner(System.`in`)
// println("Enter 5 elements for an array: ")
// for(i in 0..5-1){
//     myArry[i] = res.nextInt()
// }
// println("array")
// for(i in 0..5-1){
//     println(myArry[i])
// }
// for(i in 0..5-1){
//     sum = sum+myArry[i]
// }
// print("sum of given array : ")
// print(sum)
// }
