public class GCD {

    //Euclid's Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a1 = 54, b1 = 24;
        int a2 = 17, b2 = 13;

        System.out.println("GCD of " + a1 + " and " + b1 + ": " + findGCD(a1, b1)); 
        System.out.println("GCD of " + a2 + " and " + b2 + ": " + findGCD(a2, b2)); 
    }
}
