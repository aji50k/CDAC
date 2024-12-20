class Stack{
	static final int max = 1000;
	int top;
	int a[] = new int[max];
	
	boolean isEmpty(){
		return (top<0);
	}
	
	Stack(){
		top = -1;
	}
	
	boolean push(int x){
		if(top>=(max-1)){
			System.out.println("Stack Overflow");
			return false;
		}
		else{
			a[++top] = x;
			System.out.println(x+" pushed into stack");
			return true;
		}
	}
	
	int pop(){
		if(top<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			int x = a[top--];
			return x;
		}
	}
	
	int peek(){
		if(top<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			int x = a[top];
			return x;
		}
	}
	
	void print(){
		for(int i=top; i>-1; i--){
			System.out.println(" "+a[i]);
		}
	}
	
	public static void main(String args[]){
		Stack st = new Stack();
		st.push(5);
		st.push(3);
		st.push(7);
		System.out.println(st.pop()+" Popped from the stack");
		System.out.println("Top element is :"+st.peek());
		System.out.println("Elements present in stack : ");
		st.print();
	}
}