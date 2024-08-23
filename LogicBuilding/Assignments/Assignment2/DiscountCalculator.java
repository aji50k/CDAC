import java.util.Scanner;
class DiscountCalculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total purchase amount in Rs. :");
		double totalPurchase = sc.nextDouble();
		
		System.out.println("Do you have a membership card? (yes/no): ");
		String hasMembership = sc.next().toLowerCase();
		
		double discount = 0;
		
		if(totalPurchase >= 1000){
			discount = 20;
		}
		else if(totalPurchase >= 500){
			discount = 10;
		}
		else{
			discount = 5;
		}
		
		if(hasMembership.equals("yes")){
			discount += 5;
		}
		
		double discountAmount = (discount/100)*totalPurchase;
		double finalAmount = totalPurchase - discountAmount;
		
		System.out.println("Discount applied: "+discount+"%");
		System.out.println("Discount amount : Rs."+discountAmount);
		System.out.println("Final amount after discount: Rs."+finalAmount);
	}
}   