public class move_zero_to_end {
    static void move(int[] arr){
        int j = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1){
            return;
        }
        for(int i = j+1;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = { 1, 0, 2, 3, 4, 5, 0, 0, 6, 7 };
        move(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
