import java.util.Scanner;
class Positive{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();

		if(n>0){
			System.out.println("Positive");
		}
		else{
			System.out.println("Negative");
		}
	}
}