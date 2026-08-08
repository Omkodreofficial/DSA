public class largest_subarray_of_given_sum {
    static int largest(int[] arr, int k) {
        int maxlen = 0;
        int left = 0, right = 0;
        int sum = arr[0];
        int n = arr.length;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1, 3, 3 };
        int ans = largest(arr, 6);
        System.out.println(ans);
    }
}
