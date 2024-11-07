import kotlin.time.measureTime

//TIP <b>2.5 Sum Lists:</b> You have two numbers represented by a linked list, where each node contains a single digit.
//The digits are stored in reverse order, such that the 1's digit is at the head of the list. Write a function that adds
//the two numbers and returns the sum as a linked list. (You are not allowed to "Cheat" and just convert the linked list
//to an integer.)
//<br><br>
//EXAMPLE
//<br><br>
//Input: (7 -> 1 -> 6) + (5 -> 9 -> 2). That is, 617 + 295.
//Output: 2 -> 1 -> 9. That is, 912.
//<br><br>
//FOLLOW-UP
//<br><br>
//Suppose the digits are stored in forward order. Repeat the above problem.
//<br><br>
//EXAMPLE
//<br><br>
//Input: (6 -> 1 -> 7) + (2 -> 9 -> 5). That is, 617 + 295.
//Output: 9 -> 1 -> 2. That is, 912.
fun main() {
    val tests = listOf(
        Pair(createSinglyLinkedList(3, 10), createSinglyLinkedList(3, 10)),
        Pair(createSinglyLinkedList(3, 10), createSinglyLinkedList(3, 10)),
        Pair(createSinglyLinkedList(2, 10), createSinglyLinkedList(3, 10)),
        Pair(createSinglyLinkedList(1, 10), createSinglyLinkedList(3, 10))
    )
    tests.forEach { test ->
        var result: Node?
        val durationSize = measureTime {
            result = sumLists(test.first, test.second)
        }
        println("Test completed with the result [$result] in ${durationSize.inWholeMilliseconds} milliseconds.")
    }
}

/**
 * Explain your train of thought.
 */
fun sumLists(firstLinkedList: Node?, secondLinkedList: Node?): Node? {
    println("Test started with first node: $firstLinkedList")
    println("Then adding node: $secondLinkedList")
    return firstLinkedList
}