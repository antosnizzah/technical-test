//program that takes an integer as input and returns true if input is a power of two
public class PowerOfTwo {
    public static void main(String[] args) {
        // Enter the number you want to check
        int num = 16;

        // Check if the number is a power of two
        boolean result = isPowerOfTwo(num);

        // Print the result
        System.out.println("Is the number a power of two? " + result);
    }

    public static boolean isPowerOfTwo(int n) {

        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
