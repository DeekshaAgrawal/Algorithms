package linkedList;

public class LoopDetectionAndRemoval {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public void printList()
	{
		Node n= head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	public void insertAtStart(int n)
	{
		Node newNode = new Node(n);
		if(head==null)
		{
			head=newNode;
			return;
		}
		
		Node a= head;		
		newNode.next=a;
		head= newNode;
	}
	
	public void detectAndRemoveLoop(Node node)
	{
		Node slow=node, fast = node;
		while(slow != null && fast != null && fast.next!= null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				removeLoop(slow, node);
				return;
			}
		}
		
		/*
		Node slow=node,fast=node;
		
		while(slow!=null && fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
			{
				removeLoop(slow,node);
				return ;
			}
		}
		return ;
	*/}
	
	private void removeLoop(Node slow, Node node) {
		
		Node p1=null,p2=null;
		
		p1=node;
		while(true)
		{
			p2=slow;
			while(p2.next!=slow && p2.next!=p1)
			{
				p2= p2.next;
			}
			if(p2.next==p1)
			{
				break;
			}
			p1=p1.next;
		}
		p2.next=null;
	}

	public static void main(String[] args) {
		LoopDetectionAndRemoval list= new LoopDetectionAndRemoval();
		list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(20);
        list.head.next.next.next.next = new Node(10);
 
        // Creating a loop for testing 
        head.next.next.next.next.next = head.next.next;
        list.detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList();	
	}
}
