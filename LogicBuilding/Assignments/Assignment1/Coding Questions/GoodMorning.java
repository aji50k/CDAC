import java.util.Scanner;
class GoodMorning{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the timing :");
		int t = sc.nextInt();

		if(t>=5 && t<12){
			System.out.println("Good Morning");
		}
		else{
			System.out.println("No good morning");
		}
	}
}