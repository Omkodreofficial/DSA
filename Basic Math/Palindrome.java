public class Palindrome {

    public static boolean isPalindrome(int x) {

        int duplicate = x;
        int revNo = 0;

        while (x > 0) {
            int rem = x % 10;
            revNo = (revNo * 10) + rem;
            x = x / 10;
        }

        if (revNo == duplicate) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int num = 121;

        boolean ans = isPalindrome(num);

        if (ans) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}