package linkedList;

public class LinkedListInsertion {
	
	Node head;
	
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
	
	public void insertInBetween(Node prev, int n)
	{
		if(prev==null || head==null)
		{
			System.out.println("invalid");
			return;
		}
		
		Node a= new Node(n);
		a.next= prev.next;
		prev.next=a;
	}
	
	public void insertAtEnd(int n)
	{	
		Node newNode= new Node(n);
		
		if(head==null)
		{
			head= newNode;
			return;
		}

		Node temp = head;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next= newNode;
	}
	
	public static void main(String[] args)
	{
		LinkedListInsertion list= new LinkedListInsertion();
		list.head= new Node(1);
		Node sec= new Node(2);
		Node third= new Node(3);
		list.head.next=sec;
		sec.next=third;
		list.insertAtStart(4);
		list.printList();
		list.insertInBetween(sec, 9);
		list.printList();
		System.out.println();
		list.insertAtEnd(7);
		list.printList();
	}
}
