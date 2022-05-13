package week1;
/**
 * Revature LLC -- Project on Boarding
 * @author Hailemichael Hagos
 * a) Intersection: Given two (singly) linked lists, determine if the two lists intersect. 
 * Return the intersecting node. Note that the intersection is defined based on reference, not value. 
 * That is, if the kth node of the first linked list is the exact same node (by reference) 
 * as the jth node of the second linked list, then they are intersecting.
 */
public class Intersection {
	
	Node headL1;
    Node headL2;
	 
    static class Node {
 
        int data;
        Node nextNode;
 
        Node(int N)
        {
            data = N;
            nextNode = null;
        }
    }
 
    /*function to get the intersection point of two linked
    lists headL1 and headL2 */
    int getNode()
    {
        int c1 = getCount(headL1);
        int c2 = getCount(headL2);
        int N;
 
        if (c1 > c2) {
            N = c1 - c2;
            return _getIntesectionNode(N, headL1, headL2);
        }
        else {
            N = c2 - c1;
            return _getIntesectionNode(N, headL2, headL1);
        }
    }
 
    /* function to get the intersection point of two linked
     lists headL1 and headL2 where headL1 has N more nodes than
     headL2 */
    int _getIntesectionNode(int N, Node node1, Node node2)
    {
        int i;
        Node current1 = node1;
        Node current2 = node2;
        for (i = 0; i < N; i++) {
            if (current1 == null) {
                return -1;
            }
            current1 = current1.nextNode;
        }
        while (current1 != null && current2 != null) {
            if (current1.data == current2.data) {
                return current1.data;
            }
            current1 = current1.nextNode;
            current2 = current2.nextNode;
        }
 
        return -1;
    }
 
    /*Takes head pointer of the linked list and
    returns the count of nodes in the list */
    int getCount(Node node)
    {
        Node current = node;
        int count = 0;
 
        while (current != null) {
            count++;
            current = current.nextNode;
        }
 
        return count;
    }
 
	

}
