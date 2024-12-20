class Queue{
	
	int size = 5;
	int Q[] = new int[size];
	int front, rear;
	
	Queue(){
		front = -1;
		rear = -1;
	}
	
	boolean isEmpty(){
		return (front == -1);
	}
	
	//Insertion Operation
	boolean isFull(){
		return (rear == size-1);
	}
	
	void enqueue(int x){
		if(isFull()){
			System.out.println("Queue is full");
		}
		else{
			if(front == -1){
				front = 0;//set to 0 if queue is empty
			}
			rear++;
			Q[rear] = x;
			System.out.println(x+" Inserted");
		}
	}
	
	int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty!");
			return -1;
		}
		else{
			int x = Q[front];
			System.out.println(x+" Deleted");
			if(front>rear){
				front = -1;
				rear = -1;
			}
			else{
				front++;
			}
			return x;
		}
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Empty Queue!");
		}
		else{
			System.out.println("Queue Elements : ");
			for(int i=front; i<=rear; i++){
				System.out.println(Q[i]+"");
			}
			System.out.print("");
		}
	}
	
	public static void main(String args[]){
		Queue q1 = new Queue();
		q1.enqueue(11);
		q1.enqueue(12);
		q1.enqueue(13);
		q1.enqueue(14);
		q1.display();
		
		q1.dequeue();
		q1.display();
		
		q1.dequeue();
		q1.display();
		
		q1.dequeue();
		q1.display();
		
		q1.dequeue();
		q1.display();
		
		q1.dequeue();
		q1.display();
		
	}
}