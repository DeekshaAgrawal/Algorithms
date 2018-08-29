package linkedList;

public class LinkedListLength {

	
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
	
	public int findLength()
	{
		int n=0;
		if(head==null)
		{
			
		}
		else{
			Node temp=head;
			while(temp!=null)
			{
				n++;
				temp=temp.next;
			}
		}
		
		
		return n;
	}

	public int findLengthRecursion(Node node)
	{
		Node temp=head;
		
		if(temp==null)
		{
			return 0;
		}
		return 1+findLength();
	}
	
	public int count(){
		return findLengthRecursion(head);
	}
	
	public static void main(String[] args) {
		LinkedListLength list= new LinkedListLength();
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
		int n= list.findLength();
		System.out.println();
		System.out.println(n);
		int m= list.count();
		list.insertAtStart(7);
		System.out.println(m);
	}

}
