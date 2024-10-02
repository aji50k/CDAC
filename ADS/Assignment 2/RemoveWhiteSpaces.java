class RemoveWhiteSpaces{
	
	public static void removeWhiteSpaces(String str){
		str = str.replaceAll("\\s","");
		System.out.println(str);
	}
	
	public static void main(String args[]){
		removeWhiteSpaces( "Hello    World");
	}
}