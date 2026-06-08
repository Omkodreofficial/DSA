import java.util.*;

class printDivisors {

    public static int[] divisors(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i*i<=n; i++) {
            if (n % i == 0) {
                list.add(i);
                if((n/i)!=i){
                    list.add(n/i);
                }
            }
        }

        Collections.sort(list);
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] result = divisors(n);

        System.out.print("Divisors: ");

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}