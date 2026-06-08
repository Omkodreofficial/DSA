public class printName {
    public static void printname(int i, int n){
        if(i > n){
            return;
        }
        System.out.println("Om");
        printname(i+1,n);
    }
    public static void main(String[] args){
        printname(1,10);
    }
}
