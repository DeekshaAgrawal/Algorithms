package linkedList;

public class SwapNode {
	
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
	
	public void swap(int x, int y)
	{
		if(head==null || head.next==null)
		{
			System.out.println("invalid");
			return;
		}
		
		Node prevX=null,currX=head,prevY=null,currY=head;
		while(currX!=null && currX.data!=x)
		{
			prevX=currX;
			currX=currX.next;
		}
		
		while(currY!=null && currY.data!=y)
		{
			prevY=currY;
			currY=currY.next;
		}
		
		if(currX==null || currY==null)
		{
			System.out.println("invalid");
			return;
		}
		
		if(prevX!=null)
		{
			prevX.next=currY;
		}
		else
		{
			head=currY;
		}
		
		if(prevY!=null)
		{
			prevY.next=currX;
		}
		else
		{
			head=currX;
		}
		
		Node temp=currX.next;
		currX.next=currY.next;
		currY.next=temp;
		
		
		
		
	}
	
	public static void main(String[] args) {
		SwapNode list= new SwapNode();
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
		list.swap(5, 2);
		System.out.println();
		list.printList();
	}

}
