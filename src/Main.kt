import kotlin.time.measureTime

//TIP <b>1.7 Rotate Matrix:</b> Given an image represented by an N x N matrix, where each pixel in the image is
//represented by an integer, write a method to rotate the image by 90 degrees. Can you do this in place?
fun main() {
    val test = arrayOf(
        intArrayOf(1, 2, 3), // Rotated (7, 4, 1)
        intArrayOf(4, 5, 6), // Rotated (8, 5, 2)
        intArrayOf(7, 8, 9) //  Rotated (9, 6, 3)
    )
    val result: Array<IntArray>
    val duration = measureTime {
        result = rotateMatrix(test)
    }
    println("Test [$test] completed with the result [$result] in ${duration.inWholeMilliseconds} milliseconds.")
}

fun rotateMatrix(imageMatrix: Array<IntArray>): Array<IntArray> {
    return arrayOf()
}