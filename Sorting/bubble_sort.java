import java.util.*;

public class bubble_sort {

    static void bubble(int arr[], int n) {
        for (int i = n - 1; i >= 1; i--) {
            int didswap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didswap = 1;
                }
            }

            if(didswap ==0){
                break;
            }
            System.out.println("runs");
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

        bubble(arr, n);

        System.out.println("the sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
