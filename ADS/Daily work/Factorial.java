import java.util.Scanner;
class Factorial{
	
	public static int factorial(int a){
		int fact = 1;
		for(int i=1; i<=a; i++){
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = sc.nextInt();
		
		System.out.println("The factorial of"+a+" is :"+factorial(a));
	}
}