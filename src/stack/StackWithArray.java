package stack;

public class StackWithArray {
	
	static final int MAX= 1000;
	int top;
	int a[]= new int[MAX];
	
	StackWithArray()
	{
		top=-1;
	}
	public boolean isEmpty()
	{
		return(top<0);
	}
	
	public boolean push(int x)
	{
		if(top>=MAX)
		{
			System.out.println("Stack is full");
			return false;
		}
		else{
			a[++top]=x;
			return true;
		}
	}
	
	public int pop()
	{
		if(top<0)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
		{
			int x= a[top--];
			return x;
		}
	}
	
	public int peek()
	{
		if(top<0)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
		{
			int x= a[top];
			return x;
		}
	}
	
	public static void main(String args[])
    {
		StackWithArray s = new StackWithArray();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Popped from stack");
        System.out.println(s.peek() + " Popped from stack");
    }

}
