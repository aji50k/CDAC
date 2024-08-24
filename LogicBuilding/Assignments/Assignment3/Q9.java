//9. Write a program to find and print the largest digit in the number 4825. 
class Q9{
	public static void main(String args[]){
		int n = 4825;
		int largest = 0;
		int smallest = 9;
		
		while(n>0){
			int rem = n%10;
			largest = Math.max(rem, largest);
			smallest = Math.min(rem, smallest);
			n = n/10;
		}
		System.out.println("Largest digit is : "+largest);
		System.out.println("Smallest digit is : "+smallest);
	}
}