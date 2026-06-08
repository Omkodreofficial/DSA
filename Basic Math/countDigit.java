public class countDigit {

    public static int count(int n) {
        if (n == 0) {
            return 1;
        }

        int count = 0;

        count = (int)Math.log10(n) + 1;
        // while (n > 0) {
        //     n = n / 10;
        //     count++;
        // }

        return count;
    }

    public static void main(String[] args) {

        int n = 14;   

        int result = count(n);

        System.out.println("Number of digits = " + result);
    }
}