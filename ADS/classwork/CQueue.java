class CQueue{
	
	int size = 5;
	int CQ[] = new int[size];
	int front, rear;
	
	CQueue(){
		front = -1;
		rear = -1;
	}
	
	boolean isEmpty(){
		return (front == -1);
	}
	
	//Insertion Operation
	boolean isFull(){
		return ((rear+1)%size == front);
	}
	
	void enqueue(int x){
		if(isFull()){
			System.out.println("Queue is full");
		}
		else{
			if(front == -1){
				front = 0;//set to 0 if queue is empty
			}
			rear = (rear+1)%size;//r++
			CQ[rear] = x;
			System.out.println(x+" Inserted");
		}
	}
	
	int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty!");
			return -1;
		}
		else{
			int x = CQ[front];
			System.out.println(x+" Deleted");
			if(front>rear){
				front = -1;
				rear = -1;
			}
			else{
				front = (front+1)%size;
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
			int i = front;
			while(i != rear){
				System.out.print(CQ[i]+" ");
				i=(i+1)%size;
			}
			System.out.print("");
		}
	}
	
	public static void main(String args[]){
		CQueue cq1 = new CQueue();
		cq1.enqueue(11);
		cq1.enqueue(12);
		cq1.enqueue(13);
		cq1.enqueue(14);
		cq1.display();
		
		cq1.dequeue();
		cq1.display();
		
		cq1.dequeue();
		cq1.display();
		
		cq1.dequeue();
		cq1.display();
		
		cq1.dequeue();
		cq1.display();
		
		cq1.dequeue();
		cq1.display();
		
	}
}