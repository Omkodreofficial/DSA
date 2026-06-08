public class Basic {
    static int count = 0;
    public static void print(int n){
        if(count == n){
            return;
        }
        System.out.print(count +" ");
        count++;
        print(n);

    }
    public static void main(String[] args){

        print(20);
    }
}
