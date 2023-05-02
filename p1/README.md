#Experiment-1.1
Manual of the experiment: Kotlin Program to Find all Roots of a Quadratic:
In this program, you'll learn to find all roots of a quadratic equation (depending upon the determinant) and print them using format() in Kotlin.
The standard form of a quadratic equation is:

ax2 + bx + c = 0, where
a, b and c are real numbers and
a ≠ 0
 
The term b2-4ac is known as the determinant of a quadratic equation. The determinant tells the nature of the roots.
If determinant is greater than 0, the roots are real and different.
If determinant is equal to 0, the roots are real and equal.
If determinant is less than 0, the roots are complex and different.
Example: Kotlin Program to Find Roots of a Quadratic Equation
fun main(args: Array<String>) {
 
    val a = 2.3
    val b = 4
    val c = 5.6
    val root1: Double
    val root2: Double
    val output: String
 
    val determinant = b * b - 4.0 * a * c
 
    // condition for real and different roots
    if (determinant > 0) {
        root1 = (-b + Math.sqrt(determinant)) / (2 * a)
        root2 = (-b - Math.sqrt(determinant)) / (2 * a)
 
        output = "root1 = %.2f and root2 = %.2f".format(root1, root2)
    }
    // Condition for real and equal roots
    else if (determinant == 0.0) {
        root2 = -b / (2 * a)
        root1 = root2
 
        output = "root1 = root2 = %.2f;".format(root1)
    }
    // If roots are not real
    else {
        val realPart = -b / (2 * a)
        val imaginaryPart = Math.sqrt(-determinant) / (2 * a)
 
        output = "root1 = %.2f+%.2fi and root2 = %.2f-%.2fi".format(realPart, imaginaryPart, realPart, imaginaryPart)
    }
 
    println(output)
}
When you run the program, the output will be: root1 = -0.87+1.30i and root2 = -0.87-1.30i
  
In the above program, the coefficients a, b and c are set to 2.3, 4 and 5.6 respectively. Then, the determinant is calculated as b2 - 4ac.
Based on the value of determinant, the roots are calculated as given in the formula above. Notice we've used library function Math.sqrt() to calculate the square root of a number.
The output to be printed is then stored in a string variable output using the Kotlin's standard libary function format(). The output is then printed using println().
