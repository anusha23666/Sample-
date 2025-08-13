public class strong{
    
    // Method to calculate factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is strong
    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;      // extract last digit
            sum += factorial(digit);   // add factorial of digit
            num /= 10;                 // remove last digit
        }

        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println("Strong numbers between 1 and 5000 are:");
        for (int i = 1; i <= 5000; i++) {
            if (isStrong(i)) {
                System.out.println(i);
            }
        }
    }
}