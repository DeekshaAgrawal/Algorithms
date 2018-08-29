package circularLinkedList;

import linkedList.Node;

public class CircularLinkedList {

	static Node last;
	
	public static void main(String[] args) {
		
	//	CircularLinkedList list = new CircularLinkedList();
		last = addToEmpty(last,6);
		last = addBegin(last, 4);
		last = addEnd(last, 8);

	}

	private static Node addEnd(Node last2, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Node addBegin(Node last2, int i) {
		
		 if (last2 == null)
		        return addToEmpty(last2, i);
		 
		Node temp = new Node(i);
		temp.next = last2.next;
		last2.next = temp;
		
		
		return last2;
	}

	private static Node addToEmpty(Node last2, int i) {
		
		if(last2!= null){
			return last2;
		}
		
		Node temp = new Node(i);
		
		last2 = temp;
		last2.next = last;
		
		return last2;
	}

}
