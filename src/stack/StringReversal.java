package stack;

public class StringReversal {

	public static void main(String[] args) {
		 StringBuffer  s= new StringBuffer("GeeksforGeeks");
         
	        //call reverse method
	        reverse(s);
	           
	        //print the reversed string
	        System.out.println("Reversed string is : " + s);

	}

	private static void reverse(StringBuffer s) {
		
		StackWithArray st = new StackWithArray();
		for(int i=0; i<s.length();i++)
		{
			st.push(s.charAt(i));
		}
		
		for(int i=0;i<s.length();i++)
		{
			s.setCharAt(i, (char) st.pop());
		}
		
	}

}
