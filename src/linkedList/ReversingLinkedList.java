package linkedList;

public class ReversingLinkedList {
	
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
	
	public Node reverseList(Node node){

		Node prev=null,next=null;
		Node curr= node;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		node=prev;
		return node;
	}
	
	public static void main(String[] args) {
		ReversingLinkedList list= new ReversingLinkedList();
		list.head= new Node(1);
		Node sec= new Node(2);
		Node third= new Node(3);
		list.head.next=sec;
		sec.next=third;
		list.insertAtStart(4);
		list.insertAtStart(5);
		list.insertAtStart(6);
		list.insertAtStart(7);
		list.insertAtStart(8);
		list.printList();
		head = list.reverseList(head);
		System.out.println();
		list.printList();
	}
}
