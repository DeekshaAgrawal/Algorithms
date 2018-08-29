package linkedList;

public class MergeSortOnLinkedList {
	Node head;
	public static void main(String[] args) {

		
		MergeSortOnLinkedList list = new MergeSortOnLinkedList();
		
		list.head = new Node(12);
		list.insertAtEnd(9);
		list.insertAtEnd(37);
		list.insertAtEnd(7);
		list.insertAtEnd(22);
		list.printList(list.head);
		Node sorted = list.mergeSort(list.head);
		list.printList(sorted);
		
	}
	
	
	private Node mergeSort(Node node) {
		if(node == null || node.next == null)
		{
			return node;
		}
		
		Node middle = middleNode(node);
		Node secHalf = middle.next;
		middle.next = null;
		
		return merge(mergeSort(node), mergeSort(secHalf));
	}

	
	private Node merge(Node a, Node b) {
		Node temp = new Node();
		Node finalList = temp;
		
		while(a!=null && b!=null){
			if(a.data<b.data)
			{
				temp.next = a;
				a = a.next;
			}
			else{
				temp.next= b;
				b = b.next;
			}
			temp = temp.next;
		}
		
		temp.next = (a == null)?b:a;
		
				
		return finalList;
	}


private Node middleNode(Node node) {
	
	if(node == null)
	{
		return null;
	}
	Node first = node;
	Node sec = node.next;
	while (sec!= null && sec.next != null)
	{
		first = first.next;
		sec = sec.next.next;
	}
	
	return first;
	}


private void printList(Node node) {
		
		while(node != null)
		{
			System.out.print(node.data +" ");
			node = node.next;
		}
		System.out.println();
		
	}

	private void insertAtEnd(int i) {
		Node newNode = new Node(i);
		Node temp = head;
		if(head == null)
		{
			head = newNode;
		}
		else{
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
				
		}
		
		
	}

}
