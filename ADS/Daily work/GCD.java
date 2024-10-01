import java.util.Scanner;
class GCD{
	public static void calculateGCD(int a, int b){
		int gcd=1;
		for(int i=1; i<=a && i<=b; i++){
			if(a%i==0 && b%i==0){
				gcd=i;
			}
		}
		System.out.println("GCD of "+a+" and "+b+" is: "+gcd);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 :");
		int a = sc.nextInt();
		System.out.println("Enter number2 :");
		int b = sc.nextInt();
		
		calculateGCD(a,b);
	}
}