public class second_largest {
    public static void main(String[] args) {
        int[] arr = { 8, 8, 7, 6, 5 };
        int largest = arr[0];
        int sec_larg = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                sec_larg = largest;
                largest = arr[i];
            }
            else if(arr[i] > sec_larg && arr[i] != largest){
                sec_larg = arr[i];
            }
        }
        System.out.println("the second large element is : "+sec_larg);
    }
}
