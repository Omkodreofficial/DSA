import java.util.ArrayList;
import java.util.Scanner;

public class merge_sort {

    static void merge_sor(int arr[], int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;
        merge_sor(arr, low, mid);
        merge_sor(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    static void merge(int arr[], int low, int mid, int high) {

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {

            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i = low ;i<= high;i++){
            arr[i]=temp.get(i-low);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of array elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        merge_sor(arr, 0, n - 1);

        System.out.println("the sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
