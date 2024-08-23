import java.util.Scanner;
class LargestOfThree{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1 :");
		int a = sc.nextInt();
		System.out.println("Enter the number2 :");
		int b = sc.nextInt();
		System.out.println("Enter the number3 :");
		int c = sc.nextInt();
		
		if(a>b && a>c){
			System.out.println(a+" is greater");
		}
		else if(b>a && b>c){
			System.out.println(b+" is greater");
		}
		else{
			System.out.println(c+" is greater");
		}
	}
}