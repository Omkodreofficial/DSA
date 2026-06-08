public class SumFirst_N_Numbers {

    // paramterized way

    // public static void print(int n, int sum){
    //     if(n<1){
    //         System.out.println(sum);
    //         return;
    //     }
    //     print(n-1,sum+n);
    // }

    // Functional way

    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        // print(10, 0);
        int addition = sum(10);
        System.out.println(addition);
    }
}
