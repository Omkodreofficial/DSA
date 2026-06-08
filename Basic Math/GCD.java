import java.util.Scanner;

public class GCD {

    public static int findGCD(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2)
                n1 = n1 % n2;
            else
                n2 = n2 % n1;
        }

        if (n1 == 0)
            return n2;
        else
            return n1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int ans = findGCD(n1, n2);

        System.out.println("GCD is: " + ans);

        sc.close();
    }
}