import java.util.*;

class PrimeCheck {

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        int count = 0;

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                count++;

                // Count paired divisor
                if ((n / i) != i) {
                    count++;
                }
            }

            if (count > 2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }

        sc.close();
    }
}