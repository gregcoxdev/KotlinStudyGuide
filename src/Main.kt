import kotlin.time.measureTime

//TIP <b>2.4 Partition:</b> Write code to partition a linked list around a value x, such that all nodes less than X come
//before all nodes greater than or equal to X. (IMPORTANT: The partition element X can appear anwhere in the "right
//partition"; it does not need t appear between the left and right partitions. The additional spacing in the example
//below indicates the partition. Yes, the output below is one of many valid outputs.
//<br><br>
//EXAMPLE
//<br><br>
//Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
//Output: [LEFT] 3 -> 1 -> 2 -> [RIGHT] 10 -> 5 -> 5 -> 8
fun main() {
    val tests = listOf(
        createSinglyLinkedList(9, 500),
        createSinglyLinkedList(4, 500),
        createSinglyLinkedList(2, 500),
        createSinglyLinkedList(1, 500)
    )
    tests.forEach { test ->
        var result: Node?
        val durationSize = measureTime {
            result = partition(test)
        }
        println("Test completed with the result [$result] in ${durationSize.inWholeMilliseconds} milliseconds.")
    }
}

fun partition(headNode: Node?): Node? {
    println("Test started with head node: $headNode")
    return headNode
}