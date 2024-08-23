import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the first number :");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter an operator (+, -, *, /): ");
		char operator = sc.next().charAt(0);
		
		double result = 0;
		boolean isValidOperator = true;
		
		switch(operator){
			case '+':
				result = num1+num2;
				break;
			case '-':
				result = num1-num2;
				break;
			case '*':
				result = num1*num2;
				break;
			case '/':
				if(num2!=0){
					result = num1/num2;
				}
				else{
					System.out.println("Divide by zero not allowed");
					isValidOperator = false;
				}
				break;
			default:
				System.out.println("Invalid Operator. Please use +, -, *, /");
				isValidOperator = false;
		}
		if(isValidOperator){
			System.out.println("The result is : "+result);
		}
	}
}