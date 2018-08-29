package stack;

public class SymbolBalancing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char exp[] = {'{','(',')','}','[','[',']',']'};
		if (areParenthesisBalanced(exp))
            System.out.println("Balanced ");
          else
            System.out.println("Not Balanced ");  
		
		
		
		

	}

	private static boolean areParenthesisBalanced(char[] exp) {
		
		StackWithArray s = new StackWithArray();
		
		for(int i=0; i<exp.length; i++)
		{
			if(exp[i]=='[' || exp[i]=='('||exp[i]=='{')
			{
				s.push(exp[i]);
			}
			else if(exp[i]==']' || exp[i]=='}'||exp[i]==')')
			{
				if(s.isEmpty())
				{
					return false;
				}
				else if(!(isMatchingPair(s.pop(),exp[i])))
				{
					return false;
				}
			}
		}
		
		if(s.isEmpty()){
			return true;
		}
		
		
		return false;
	}

	private static boolean isMatchingPair(int pop, char c) {

		if(pop == '[' && c == ']'){
			return true;
		}
		else if(pop == '{' && c == '}'){
			return true;
		}
		else if(pop == '(' && c == ')'){
			return true;
		}
		
		
		return false;
	}

}
