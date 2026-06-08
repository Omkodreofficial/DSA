public class reversenumber {
    public static int reverseNumber(int n) {

        int revNo = 0;

        while (n > 0) {
            int rem = n % 10;
            revNo = (revNo * 10) + rem;
            n = n / 10;
        }

        return revNo;
    }

    public static void main(String[] args) {

        int n = 1234;

        int result = reverseNumber(n);

        System.out.println("Reversed number = " + result);
    }
}
