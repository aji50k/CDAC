class Armstrong {
    static boolean isArmstrong(int n) {
        int digits = 0, temp, sum = 0;
        temp = n;

        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        System.out.println("The number of digits: " + digits);

        temp = n;
        
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum = (int) (sum + Math.pow(lastDigit, digits));
            temp = temp / 10;
        }

       
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println("Is Armstrong number: " + isArmstrong(153)); // true
    }
}
