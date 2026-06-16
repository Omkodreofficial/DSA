import java.util.Scanner;

public class frequencies_of_array_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number the elements for the array : ");
        int n = sc.nextInt();
        int []arr= new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] hash = new int[13];
        for(int i = 0;i<n;i++){
            hash[arr[i]]+=1;
        }
        System.out.println("enter the number of q");
        int q = sc.nextInt();
        while(q!=0){
            System.out.println("enter the q");
            int number = sc.nextInt();
            System.out.println(number+" occure "+hash[number]+" times");
            q--;
        }
        sc.close();
    }
}
