import kotlin.time.measureTime

//TIP <b>1.7 Rotate Matrix:</b> Given an image represented by an N x N matrix, where each pixel in the image is
//represented by an integer, write a method to rotate the image by 90 degrees. Can you do this in place?
fun main() {
    val test = arrayOf(
        intArrayOf(1,   2,  3,  4),
        intArrayOf(5,   6,  7,  8),
        intArrayOf(9,  10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )
    val result: String
    val duration = measureTime {
        result = rotateMatrix(test)
    }
    println("Test [${test.contentDeepToString()}] completed with the result [$result] in ${duration.inWholeMilliseconds} milliseconds.")
}

fun rotateMatrix(imageMatrix: Array<IntArray>): String {

    val n = imageMatrix.size - 1

    for (i in 0..n - 2) {
        for (j in 0..n) {
            val tempInner10 = imageMatrix[i][j]
            val tempInner11 = imageMatrix[i][n - j]
            val tempInner12 = imageMatrix[n - i][n - j]
            val tempInner13 = imageMatrix[n - j][i]
            imageMatrix[i][j] = tempInner13
            imageMatrix[i][n - j] = tempInner10
            imageMatrix[n - i][n - j] = tempInner11
            imageMatrix[n - j][i] = tempInner12
            println("Swap $tempInner10 with $tempInner11")
            println("Swap $tempInner11 with $tempInner12")
            println("Swap $tempInner12 with $tempInner13")
            println("Swap $tempInner13 with $tempInner10")
            println("====end j=$j=====")
        }
        println("====end i=$i=====")
    }

//    imageMatrix.first().forEachIndexed { index, number ->
//        if (index == n) return@forEachIndexed
//        val tempInner10 = imageMatrix[0][index]
//        val tempInner11 = imageMatrix[index][n]
//        val tempInner12 = imageMatrix[n][n - index]
//        val tempInner13 = imageMatrix[n - index][0]
//        imageMatrix[0][index] = tempInner13
//        imageMatrix[index][n] = tempInner10
//        imageMatrix[n][n - index] = tempInner11
//        imageMatrix[n - index][0] = tempInner12
//        println("Swap $tempInner10 with $tempInner11")
//        println("Swap $tempInner11 with $tempInner12")
//        println("Swap $tempInner12 with $tempInner13")
//        println("Swap $tempInner13 with $tempInner10")
//        println("=========")
//
//    }

//    // Outers
//    var tempVal = imageMatrix[0][3]
//    imageMatrix[0][3] = imageMatrix[0][0]
//    imageMatrix[0][0] = tempVal
//
//    tempVal = imageMatrix[3][3]
//    imageMatrix[3][3] = imageMatrix[0][0]
//    imageMatrix[0][0] = tempVal
//
//    tempVal = imageMatrix[3][0]
//    imageMatrix[3][0] = imageMatrix[0][0]
//    imageMatrix[0][0] = tempVal
//
//    // Inners
//    var tempVal2 = imageMatrix[1][3]
//    imageMatrix[1][3] = imageMatrix[0][1]
//    imageMatrix[0][1] = tempVal2
//
//    tempVal2 = imageMatrix[3][2]
//    imageMatrix[3][2] = imageMatrix[0][1]
//    imageMatrix[0][1] = tempVal2
//
//    tempVal2 = imageMatrix[2][0]
//    imageMatrix[2][0] = imageMatrix[0][1]
//    imageMatrix[0][1] = tempVal2
//
//    val i1 = 1
//    val n1 = 3
//    val tempInner10 = imageMatrix[0][1]
//    val tempInner11 = imageMatrix[1][3]
//    val tempInner12 = imageMatrix[3][2]
//    val tempInner13 = imageMatrix[2][0]
//    println("Swap $tempInner10 with $tempInner11")
//    println("Swap $tempInner11 with $tempInner12")
//    println("Swap $tempInner12 with $tempInner13")
//    println("Swap $tempInner13 with $tempInner10")
//
//    // Inner
//    val i2 = 2
//    val n2 = 3
//    val tempInner20 = imageMatrix[0][2]
//    val tempInner21 = imageMatrix[2][3]
//    val tempInner22 = imageMatrix[3][1]
//    val tempInner23 = imageMatrix[1][0]
//    println("Swap $tempInner20 with $tempInner21")
//    println("Swap $tempInner21 with $tempInner22")
//    println("Swap $tempInner22 with $tempInner23")
//    println("Swap $tempInner23 with $tempInner20")

    return imageMatrix.contentDeepToString()
}