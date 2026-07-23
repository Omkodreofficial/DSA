import java.util.Scanner;

public class Recursive_bubble_sort {

    static void bubble_sort(int arr[], int n) {
        if (n == 1) {
            return;
        }
        int didswap = 0;

        for (int i = 0; i <= n - 2; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                didswap = 1;
            }
        }
        if(didswap != 1) return;
        System.out.println("run");
        bubble_sort(arr, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of array elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubble_sort(arr, n);

        System.out.println("the sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
