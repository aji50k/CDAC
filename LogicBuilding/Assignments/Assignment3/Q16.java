/*
16. Write a program to print the following pattern:
       *
     * * *
   * * * * *
  * * * * * * *
* * * * * * * * *

*/

class Q16  {  
	public static void main(String args[])  {  
		int row, i, j, space = 1;   
		row = 5;  
		space = row - 1;  
		for (j = 1; j<= row; j++)  {  
			for (i = 1; i<= space; i++)  {  
				System.out.print(" ");  
			}  
			space--;  
			for (i = 1; i <= 2 * j - 1; i++)  {  
				System.out.print("*");  
			}  
			System.out.println("");  
		}  
	}
}