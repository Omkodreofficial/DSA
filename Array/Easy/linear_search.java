public class linear_search {
    static void search(int [] arr, int a){
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] == a){
                System.out.println("the element found at location "+i);
                return;
            }
        }
        System.out.println("the element not found in this array");
        return;
    }
    public static void main(String [] args){
        int[] arr = { 1, 2, 3, 4, 5, 6, 7};
        search(arr,3);

    }
}
