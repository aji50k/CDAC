class StringPalindrome{
	public static void checkPalindrome(String str){
		char[] arrstr = str.toCharArray();
		String original = str;
		for(int i=0; i<=arrstr.length-1; i++){
			for(int j=i+1; j<=arrstr.length-1; j++){
				char temp = arrstr[i];
				arrstr[i] = arrstr[j];
				arrstr[j] = temp;
			}
			//System.out.print(arrstr[i]);
		}
		if (str.equals(original)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
	}
	public static void main(String args[]){
		checkPalindrome("madam");
	}
}