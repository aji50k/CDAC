class CheckOddEven{
	public static void oddEven(int n){
		if(n%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
	
	public static void main(String args[]){
		//int n = 23;
		oddEven(22);
	}
}