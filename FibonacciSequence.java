// program to generate the Fibonacci Sequence up to 100
public class FibonacciSequence {
    public static void main(String[] args) {
        int limit = 100;
        int a = 0, b = 1;

        System.out.println("Fibonacci sequence up to 100:");


        System.out.print(a + " ");
        System.out.print(b + " ");


        while (a + b <= limit) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
