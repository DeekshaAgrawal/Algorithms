package linkedList;

public class MergeSortedList {
	
	Node head;

	public static void main(String[] args){
		
		MergeSortedList list = new MergeSortedList();
		MergeSortedList list2 = new MergeSortedList();
		
		Node mergedList ;
		list.head = new Node(1);
		Node sec = new Node(5);
		Node thrd = new Node(9);
		
		list.head.next= sec;
		sec.next = thrd;
		
		
		list2.head = new Node(2);
		Node sec2 = new Node(4);
		Node thrd2 = new Node(6);
		list2.head.next= sec2;
		sec2.next = thrd2;
		
		mergedList = merge(list.head, list2.head);
		printList(mergedList);

	}
	private static void printList(Node node) {
		
		while(node != null)
		{
			System.out.print(node.data +" ");
			node = node.next;
		}
		System.out.println();
		
	}
	private static Node merge(Node list1, Node list2) {
		if (list1 == null) return list2;
		
	  if (list2 == null) return list1;

	  if (list1.data < list2.data) {
	    list1.next = merge(list1.next, list2);
	    return list1;
	  } else {
	    list2.next = merge(list1, list2.next);
	    return list2;
	  }
	}
}
