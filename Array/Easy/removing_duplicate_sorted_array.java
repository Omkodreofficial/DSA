public class removing_duplicate_sorted_array{
    static int remove(int[] arr){
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String [] args){
        int [] arr = {1,1,2,2,3,3,4,4,5,5};
        int count = remove(arr);
        System.out.println("the count of unique elements are : "+count);
    }
}