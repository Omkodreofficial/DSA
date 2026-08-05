import java.util.ArrayList;

public class intersection_of_two_sorted_arrays {

    public static ArrayList<Integer> intersection_sorted(int[] arr, int[] arr2){
        ArrayList<Integer> intersection = new ArrayList<>();
        int n = arr.length;
        int m = arr2.length;;
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(arr[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr[i]){
                j++;
            }
            else{
                intersection.add(arr[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }

    public static void main(String[] args){
        int[] arr = { 1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = { 2, 3, 3, 5, 6, 6, 7};

        ArrayList<Integer> result =  intersection_sorted(arr, arr2);
        System.out.println(result); 
    }
}
