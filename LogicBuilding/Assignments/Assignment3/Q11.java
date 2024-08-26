//11. Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression.
class Q11{
	public static void main(String args[]){
		System.out.println("a :10, b :10, c :10, d :10");
		int a=10;
		System.out.println("a++ :"+ a++);
		int b=10;
		System.out.println("++b :"+ ++b);
		int c=10;
		System.out.println("c-- :"+ c--);
		int d=10;
		System.out.println("--d :"+ --d);
	}
}