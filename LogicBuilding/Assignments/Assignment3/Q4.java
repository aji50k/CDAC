//4. Write a program to reverse the digits of the number 1234. The output should be 4321. 
class Q4{
	public static void main(String args[]){
		int n = 123456;
		int rev = 0;
		
		while(n!=0){
			rev = rev*10+(n%10);
			n = n/10;
		}
		System.out.println("Reversed number is : "+rev);
	}
}