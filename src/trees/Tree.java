package trees;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node right, left;
	
	public Node(int item)
	{
		data = item;
		right = left = null;
		
	}
}

public class Tree {

	Node root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree t1 = new Tree();
		t1.root = new Node(1);
		t1.root.left = new Node(2);
		t1.root.right = new Node(3);
		t1.root.left.left = new Node(4);
		t1.root.left.right = new Node(5);
		
		t1.printInorder(t1.root);
		System.out.println();
		t1.printPreOrder(t1.root);
		System.out.println();
		t1.printPostOrder(t1.root);
		System.out.println();
		t1.printBFS(t1.root);
		System.out.println();
		t1.printBFSUsingQueue(t1.root);

	}

	private void printBFSUsingQueue(Node root2) {
		
		
		Queue<Node> qu = new LinkedList<>();
		qu.add(root2);
		while(!qu.isEmpty()){
			Node temp = qu.poll();
			System.out.print(temp.data+" ");
			if(temp.left!= null){
				qu.add(temp.left);
			}
			if(temp.right!= null){
				qu.add(temp.right);
			}
			
		}
		
		
	}

	private void printBFS(Node root2) {
		// TODO Auto-generated method stub
		
		int h = getHeight(root2);
		System.out.println(h);
		for(int i=1; i<=h;i++)
		{
			printLevels(root2, i);
		}
		
	}

	private void printLevels(Node root2, int i) {

		if(root2 == null)
		{
			return;
		}
		
		if(i == 1)
		{
			System.out.print(root2.data+" ");
		}
		else if(i > 1){
			printLevels(root2.left, i-1);
			printLevels(root2.right, i-1);
		}
		
	}

	private int getHeight(Node root2) {

		if(root2 == null)
		{
			return 0;
		}
		else{
			int lHeight = getHeight(root2.left);
			int rHeight = getHeight(root2.right);
			
			if(lHeight>rHeight)
			{
				return (lHeight+1);
			}
			else{
				return (rHeight+1);
			}
		}
		
	}

	private void printInorder(Node root2) {
		
		if(root2 == null)
		{
			return;
		}
		
		printInorder(root2.left);
		System.out.print(root2.data+" ");
		printInorder(root2.right);
		
	}
	
	private void printPreOrder(Node root2) {
		
		if(root2 == null)
		{
			return;
		}
		System.out.print(root2.data+" ");
		printPreOrder(root2.left);
		
		printPreOrder(root2.right);
		
	}
	
	private void printPostOrder(Node root2) {
		
		if(root2 == null)
		{
			return;
		}
		
		printPostOrder(root2.left);
		
		printPostOrder(root2.right);
		System.out.print(root2.data+" ");
		
	}

}
