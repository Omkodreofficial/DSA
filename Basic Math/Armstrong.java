public class Armstrong {

    public static boolean isArmstrong(int n) {

        int original = n;
        int count = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, count);
            n = n / 10;
        }

        if (sum == original) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        int num = 153;

        boolean ans = isArmstrong(num);

        if (ans) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}