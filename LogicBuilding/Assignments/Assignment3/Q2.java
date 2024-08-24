//2. Write a program to compute the factorial of the number 10. 
class Q2{
	public static void main(String args[]){
		int fact=1;
		int n = 10;
		for(int i=1; i<=n; i++){
			fact = fact*i;
		}
		System.out.println("The factorial of the number 10 is : "+fact);
	}
}