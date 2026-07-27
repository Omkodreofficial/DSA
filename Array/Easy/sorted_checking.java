public class sorted_checking {
    static boolean check(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) {
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        boolean ans = check(nums);
        System.out.println(ans);
    }
}
