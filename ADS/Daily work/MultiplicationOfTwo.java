import java.util.Scanner;
class MultiplicationOfTwo{
	public static int Mult(int a, int b){
		int mult = a*b;
		return mult;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(Mult(a, b));
	}
}