class StackArrayImplementation{
	int top;
	int capacity;
	int[] stack;
	
	StackArrayImplementation(){
		top=-1;
		capacity=10;
		stack=new int[capacity];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == capacity-1;
	}
	
	public int push(int data){ 
		if(isFull()){
			System.out.println("Stack is full");
		}
		return stack[++top] = data;
	}
	
	public int pop(){ //removing top element
		if(isEmpty()){
			system.out.println("stack is empty");
		}
		return stack[--top] = data;
	}
	
	public int peek(){ //returning top element
		return stack[top];
	}
	
	public static void main(String args[]){
		StackArrayImplementation st = StackArrayImplementation();
		st.push(34);
		st.push(134);
		st.push(24);
		st.push(14);
		st.push(40);
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
		System.out.println(st.capacity());
		System.out.println(st.peek());
		System.out.println(st.pop());
	}
}