public class left_rotate_by_N_place {
    static void rotate(int[] arr, int n, int k) {
        k = k % n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i-(n-k)];  // temp[i-(n-k)] this is using because of the to does not need the another variable for the traversing the temp array
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 7, 3);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
