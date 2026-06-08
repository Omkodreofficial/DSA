public class print1toN_BrackTrack {
    public static void print(int i , int n){
        if(i<1){
            return;
        }
        print(i-1,n);
        System.out.println(i);
    }
    public static void main(String [] args){
        print(3,3);
    }
}
