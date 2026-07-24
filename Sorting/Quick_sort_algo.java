import java.util.Scanner;

public class Quick_sort_algo {

    static void Quick_sort(int arr[], int low, int high) {
        if (low < high) {
            int pivot_index = pivot_val(arr, low, high);
            Quick_sort(arr, low, pivot_index - 1);
            Quick_sort(arr, pivot_index + 1, high);
        }
    }

    static int pivot_val(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of array elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Quick_sort(arr, 0, n - 1);

        System.out.println("the sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
