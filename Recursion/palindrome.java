public class palindrome {
    public static boolean pail(int i ,String s){
        if(i>= s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return pail(i+1,s);
    }

    public static void main(String [] args){
        String s = "MADAM";
        String s2 = "MADAB";
        boolean result = pail(0,s);
        boolean result2 = pail(0,s2);
        System.out.println(result);
        System.out.println(result2);
    }
}
