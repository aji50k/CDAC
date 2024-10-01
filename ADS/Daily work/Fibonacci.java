class Fibonacci{
	
	public static void printFibonacci(int n){
		int first=0, second=1, sum = 0;
		System.out.print(first+"  "+second);
		for(int i=2; i<=n; i++){
			sum=first+second;
			System.out.print("  "+sum+" ");
			first = second;
			second = sum;
		}
		
	}
	
	public static void main(String args[]){
		printFibonacci(15);
	}
}