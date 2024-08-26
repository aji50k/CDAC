/*

17. Write a program to print the following pattern:
 *****
 ****
 ***
 **
 *

*/

 
public class Q17  {  
	public static void main(String[] args)  {  
		int i, j, k, n;  
		n = 5;              
		for (i= 0; i<= n-1 ; i++)  {  
			for (j=0; j<i; j++)  {  
				System.out.print(" ");  
			}  
			for (k=i; k<=n-1; k++)   {   
				System.out.print("*" + " ");   
			}   
			System.out.println("");   
		} 
	}
}