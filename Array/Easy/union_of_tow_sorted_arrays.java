import java.util.ArrayList;

public class union_of_tow_sorted_arrays {

    public static ArrayList<Integer> union_sorted(int[] arr, int[] arr1) {

        ArrayList<Integer> union = new ArrayList<>();
        int n1 = arr.length;
        int n2 = arr1.length;
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            if (arr[i] <= arr1[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr[i]) {
                    union.add(arr[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[j]) {
                    union.add(arr1[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr[i]) {
                union.add(arr[i]);
            }
            i++;
        }

        while (j < n2) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[j]) {
                union.add(arr1[j]);
            }
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 5, 7 };
        int[] arr2 = { 1, 3, 4, 4, 9 };

        ArrayList<Integer> result =  union_sorted(arr, arr2);
        System.out.println(result); 
    }
}
