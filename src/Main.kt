import kotlin.time.measureTime

//TIP <b>1.8 Zero Matrix:</b> Write an algorithm such that if an element in an M X N matrix is 0, its entire row and
//column are set to 0.
fun main() {
    val test = arrayOf(
        intArrayOf( 1,   2,  3,  4,  5),
        intArrayOf( 6,   7,  8,  9, 10),
        intArrayOf(11,  12, 13, 14, 15),
        intArrayOf(16,  17, 18, 19, 20)
    )
    val duration = measureTime {
        zeroMatrix(test)
    }
    println("Test [${test.contentDeepToString()}] completed with the result [$result] in ${duration.inWholeMilliseconds} milliseconds.")
}

fun zeroMatrix(imageMatrix: Array<IntArray>): Unit {

}