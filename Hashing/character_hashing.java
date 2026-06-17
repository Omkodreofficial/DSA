import java.util.Scanner;
public class character_hashing {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();
        

        // this is valid for the lowercase,uppercase and other all 266 characters
        int []hash = new int[256];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }

        System.out.println("enter the no of queries");
        int q = sc.nextInt();
        while(q!=0){
            System.out.println("enter the character");
            char c = sc.next().charAt(0);
            System.out.println("the character : "+c+" comes "+hash[c]+" no of times");
            q--;
        }



        // this is only for the lower case letters

        // int []hash = new int[26];
        // for(int i=0;i<s.length();i++){
        //     hash[s.charAt(i)-'a']++;
        // }

        // System.out.println("enter the no of queries");
        // int q = sc.nextInt();
        // while(q!=0){
        //     System.out.println("enter the character");
        //     char c = sc.next().charAt(0);
        //     System.out.println("the character : "+c+" comes "+hash[c-'a']+" no of times");
        //     q--;
        // }


    }
}
