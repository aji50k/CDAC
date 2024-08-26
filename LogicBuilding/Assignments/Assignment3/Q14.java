/*

14. Write a program to print the following pattern:
 *
 **
 ***
 *****
 *******
 ********* 

*/

class Q14{
	public static void main(String args[]){
		for(int i=1; i<=3; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=3; i++){
			for(int j=1; j<=5; j+=2){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

