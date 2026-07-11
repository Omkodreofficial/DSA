import java.util.Scanner;
public class selection_sort {

    static void selection_sort(int arr[], int n){
        for(int i=0;i<=n-2;i++){
            int mini = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of array elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        selection_sort(arr,n);

        System.out.println("the sorted array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
