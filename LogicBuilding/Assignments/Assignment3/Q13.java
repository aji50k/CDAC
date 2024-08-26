/*

13. Write a program to print the following pattern:
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1 

*/


class Q13{
	public static void main(String args[]){
		int num=5, z=1, p, n;
		
		for(int i=1; i<=num; i++, z=z+2){
			for(int j=1; j<=z; j++){
				if(j%2==0){
					System.out.print("*");
				}
				else{
					System.out.print(i);
				}
			}
			System.out.println();
		}
		
		n = num+3;
		p = num-1;
		for(int i=num; i>=1; i--, n=n-2, p--){
			for(int j=1; j<=n; j++){
				if(j%2==0){
					System.out.print("*");
				}
				else{
					System.out.print(p);
				}
			}
			System.out.println();
		}
	}
}

