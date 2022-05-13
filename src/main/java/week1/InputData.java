package week1;

import week1.Intersection.Node;
import week1.LoopDetection.LNode;

public class InputData {
    public void IntersectionData()
    {
    	Intersection list = new Intersection();
 
        // creating first linked list
        list.headL1 = new Node(3);
        list.headL1.nextNode = new Node(6);
        list.headL1.nextNode.nextNode = new Node(9);
        list.headL1.nextNode.nextNode.nextNode = new Node(18);
        list.headL1.nextNode.nextNode.nextNode.nextNode = new Node(30);
        
 
        // creating second linked list
        list.headL2 = new Node(10);
        list.headL2.nextNode = new Node(15);
        list.headL2.nextNode.nextNode = new Node(30);
 
        System.out.println("The node of intersection is " + list.getNode());
    }

	/* Driver to test above function*/
	public  void LoopDectectedData()
	{
		LoopDetection LNode = new LoopDetection();
		
	    LNode head = LNode.newNode(5);
	    head.next = LNode.newNode(2);
	    head.next.next = LNode.newNode(1);
	    head.next.next.next = LNode.newNode(4);
	    head.next.next.next.next = LNode.newNode(1);
	 
	    /* Create a loop for testing */
	    head.next.next.next.next.next = head.next.next;
	 
	    LNode res = LNode.detectLoop(head);
	    if (res == null)
	        System.out.print("Loop does not exist");
	    else
	        System.out.print("Loop starting node is " + res.key);
	 
	}
    
}
