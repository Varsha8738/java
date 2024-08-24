 public class PrimeNumbersInRange {
    public static void main(String[] args) {
        int start = 10; // Change the start of the range
        int end = 50; // Change the end of the range

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false; // 0, 1, and negative numbers are not prime
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // Check for divisors between 2 and n-1
            }
        }
        return true;
    }
}
