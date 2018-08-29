package stack;

public class StackWithLinkedList {
	
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
	public boolean push(int n)
	{
		if(head==null)
		{
			head.data=n;
			return true;
		}
		else{
			
		}
		return true;
	}
	public int peek(){
		return 1;
	}
	
	
	public static void main(String[] args)
	{
		StackWithLinkedList list= new StackWithLinkedList();
		
		list.head=null;
		list.peek();
	}

}
