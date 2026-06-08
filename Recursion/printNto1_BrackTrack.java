public class printNto1_BrackTrack {
     public static void print(int i , int n){
        if(i>n){
            return;
        }
        print(i+1,n);
        System.out.println(i);
        
    }
    public static void main(String[] args){
        print(1,3);
    } 
}
