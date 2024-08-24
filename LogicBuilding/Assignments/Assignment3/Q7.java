//7. Write a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6). 
public class Q7{
    public static void main(String[] args) {
        int n = 9876;
		int sum = 0;
		
		while(n>0){
			int rem = n%10;
			sum = sum + rem;
			n = n/10;
		}
		
		System.out.println("The sum of the digits of the number 9876 : "+sum);
    }
}