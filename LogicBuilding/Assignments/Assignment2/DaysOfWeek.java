import java.util.Scanner;
class DaysOfWeek{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day: ");
		int day = sc.nextInt();
		
		switch(day){
			case 1:
				System.out.println("Monday");
				switch(day){
					case 1:
						System.out.println("It's a weekday");
				}
				break;
			case 2:
				System.out.println("Tuesday");
				switch(day){
					case 2:
						System.out.println("It's a weekday");
				}
				break;
			case 3:
				System.out.println("Wednesday");
				switch(day){
					case 3:
						System.out.println("It's a weekday");
				}
				break;
			case 4:
				System.out.println("Thursday");
				switch(day){
					case 4:
						System.out.println("It's a weekday");
				}
				break;
			case 5:
				System.out.println("Friday");
				switch(day){
					case 5:
						System.out.println("It's a weekday");
				}
				break;
			case 6:
				System.out.println("Saturday");
				switch(day){
					case 6:
						System.out.println("It's a weekday");
				}
				break;
			case 7:
				System.out.println("Sunday");
				switch(day){
					case 7:
						System.out.println("It's a weekend");
				}
				break;					
		}
	}
}