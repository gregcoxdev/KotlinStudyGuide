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
        Pair(createSinglyLinkedList(3, 10), createSinglyLinkedList(3, 10)),
        Pair(createSinglyLinkedList(3, 10), createSinglyLinkedList(3, 10))
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
 * We're going to make an assumption that the linked lists are equal in size. If they aren't, then we'd have to go get
 * the size in order to make sure we know where the numbers line up. But given that they're the same size, we should be
 * able to add each index and carry over the 10's digit into the next calculation.
 */
fun sumLists(firstHeadNode: Node?, secondHeadNode: Node?): Node? {
    println("Test started adding nodes: $firstHeadNode + $secondHeadNode.")
    var tensDigit = 0
    var currentFirstNode = firstHeadNode
    var currentSecondNode = secondHeadNode
    var resultNode: Node? = null
    var currentResultNode = resultNode
    while (currentFirstNode != null && currentSecondNode != null) {
        val addedValue = currentFirstNode.value + currentSecondNode.value + tensDigit
        println("Added ${currentFirstNode.value} and ${currentSecondNode.value}, plus tens place of: $tensDigit = $addedValue")
        tensDigit = if (addedValue >= 10) 1 else 0
        if (resultNode == null) {
            resultNode = Node(addedValue % 10)
            currentResultNode = resultNode.next
        } else {
            currentResultNode = Node(addedValue % 10)
        }
        currentResultNode = currentResultNode?.next
        currentFirstNode = currentFirstNode.next
        currentSecondNode = currentSecondNode.next
    }

    if (tensDigit > 0) {
        currentResultNode?.next = Node(tensDigit)
    }
    return resultNode
}