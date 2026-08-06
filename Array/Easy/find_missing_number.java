public class find_missing_number {

    static int missing(int[] arr) {
        int xor1 = 0, xor2 = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ (n+1);
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 7, 3, 2, 1 };

        System.out.println(missing(arr));
    }
}