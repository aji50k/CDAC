//5. Write a program to print the Fibonacci sequence up to the number 21. 
class Q5{
	public static void main(String args[]){
		int n1=0, n2=1, sum=0;
		System.out.print(n1+" ,"+n2);
		for(int i=2; i<21; i++){
			sum = n1+n2;
			System.out.print(" ,"+sum);
			n1=n2;
			n2=sum;
			if(sum==21){
				break;
			}
		}
	}
}