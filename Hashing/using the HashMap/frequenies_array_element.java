import java.util.HashMap;
import java.util.Scanner;

public class frequenies_array_element {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of elements : ");
        int n = sc.nextInt();

        int []arr= new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i =0 ;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("enter the number of q");
        int q = sc.nextInt();
        while(q!=0){
            System.out.println("enter the q");
            int number = sc.nextInt();
            System.out.println(number+" occure "+map.getOrDefault(number, 0)+" times");
            q--;
        }
        sc.close();
    }
}
