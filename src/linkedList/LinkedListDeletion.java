package linkedList;

public class LinkedListDeletion {
	
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
	
	public void deleteNode(int n)
	{
		if(head==null)
		{
			System.out.println("invalid");
			return;
		}
		Node temp= head;
		Node prev=null;
		if(temp!=null && temp.data==n)
		{
			head=head.next;
			return;
		}
		
		while(temp!=null && temp.data!=n)
		{
			prev=temp;
			temp=temp.next;
		}
		
		if(temp!=null)
		{
			prev.next=temp.next;
			temp.next=null;
		}
	}
	
	public static void main(String[] args)
	{
		LinkedListDeletion list= new LinkedListDeletion();
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
		list.deleteNode(8);
		System.out.println();
		list.printList();
	}

}
