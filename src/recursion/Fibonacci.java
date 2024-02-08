package recursion;

public class Fibonacci {

    public static int findFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.print("Fibonacci Series of " + 5 + " numbers is: \n");
        for (int i = 0; i < 9; i++) {
            System.out.print(findFibonacci(i) + " ");
        }
    }
}
