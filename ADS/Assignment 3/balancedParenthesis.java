import java.util.Stack;
class balancedParenthesis{
	
	public static boolean ispar(String s){
		Stack<Character> stk = new Stack<>();
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
				stk.push(s.charAt(i));
			}
			else{
				 if (!stk.empty() && 
                    ((stk.peek() == '(' && s.charAt(i) == ')') ||
                     (stk.peek() == '{' && s.charAt(i) == '}') ||
                     (stk.peek() == '[' && s.charAt(i) == ']'))) {
                    stk.pop(); 
                }
                else {
                    return false; 
                }
			}
		}
		return stk.empty();
	}
	
	public static void main(String args[]){
		String s = "({[()]})";
		if(ispar(s)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}
