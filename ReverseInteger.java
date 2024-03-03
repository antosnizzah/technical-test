//program that takes an integer as input and returns an integer with reverse digit ordering
public class ReverseInteger {
    public static void main(String[] args) {
        int input = 2738;
        int result = reverseInteger(input);
        System.out.println(result);
    }

    public static int reverseInteger(int num) {
        int reversedNum = 0;

        // Reversing the digits
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}
