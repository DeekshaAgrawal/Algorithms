package stack;

public class NGE {

	public static void main(String[] args) {
		 int arr[] = { 11, 13, 21, 3 };
	        int n = arr.length;
	        printNGE(arr, n);

	}

	static void printNGE(int arr[], int n) 
    {
		StackWithArray st = new StackWithArray();
		st.push(arr[0]);
		int next, element;
		for(int i = 1; i<n; i++)
		{
			next = arr[i];
			
			if(st.isEmpty()== false)
			{
				element = st.pop();
				while(element<next){
					System.out.println(element+"------->"+next);
					if(st.isEmpty()){
						break;
					}
					element = st.pop();
				}
				
				if(element>next)
				{
					st.push(element);
				}
			}
			
			st.push(next);
			
		}
		next = -1;
		while(!st.isEmpty())
		{
			element = st.pop();
			
			System.out.println(element+"------->"+next);
		}
    }
}
