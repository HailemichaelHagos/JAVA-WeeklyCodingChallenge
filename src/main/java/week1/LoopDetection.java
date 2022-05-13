package week1;
/**
 * Revature LLC -- Project on Boarding
 * @author Hailemichael Hagos
 * b) Loop Detection: Given a circular linked list, implement an algorithm that returns the node 
 * at the beginning of the loop.
 * DEFINITION:
 * Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node,
 *  so as to make a loop in the linked list.
 */

public class LoopDetection {
		
	class LNode
	{
	    int key;
	    LNode next;
	}
	 
	 LNode newNode(int key)
	{
	    LNode temp = new LNode();
	    temp.key = key;
	    temp.next = null;
	    return temp;
	}
	 
	// Method to print a linked list
	public void printList(LNode head)
	{
	    while (head != null)
	    {
	        System.out.print(head.key + " ");
	        head = head.next;
	    }
	    System.out.println();
	}
	 
	// Method to detect first node of loop in a linked list that may contain loop
	public LNode detectLoop(LNode head)
	{
	 
	    // Create a temporary node
	    LNode temp = new LNode();
	    while (head != null)
	    {
	 
	        // This condition is for the case
	        // when there is no loop
	        if (head.next == null)
	        {
	            return null;
	        }
	 
	        // Check if next is already pointing to temp
	        if (head.next == temp)
	        {
	            break;
	        }
	 
	        // Store the pointer to the next node
	        // in order to get to it in the next step
	        LNode nex = head.next;
	 
	        // Make next point to temp
	        head.next = temp;
	 
	        // Get to the next node in the list
	        head = nex;
	    }
	 
	    return head;
	}


}
