class ReverseString{
	public static void reverse(String str){
		char[] arrstr = str.toCharArray();
		
		for(int i=0; i<=arrstr.length-1; i++){
			for(int j=i+1; j<=arrstr.length-1; j++){
				char temp = arrstr[i];
				arrstr[i] = arrstr[j];
				arrstr[j] = temp;
			}
			System.out.print(arrstr[i]);
		}
	}
	public static void main(String args[]){
		reverse("SATARA");
	}
}