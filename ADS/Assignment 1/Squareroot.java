import java.util.Scanner;

class Squareroot{
	public static double calculateSquareroot(int n) {
        return Math.sqrt(n); 
    }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Squareroot of "+n+" is :"+calculateSquareroot(n));
	}
}