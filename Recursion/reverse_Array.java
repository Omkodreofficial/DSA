import java.util.Scanner;

public class reverse_Array {
    public static void reverse(int i,int arr[], int n){
        if(i>=n/2){
            return;
        }
        
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverse(i+1, arr, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        reverse(0, arr, n);

        for(int i=0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
