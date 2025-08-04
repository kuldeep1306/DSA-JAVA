public class linearsearch {
    public static void main(String[] args) {
        int nums[] =  {3,2,4,34,53,423,4,35,53,34,4};
        int target=423;
        int ans = linearsearch(nums, target);
        System.out.println("Element found at index: " + ans);
    }
    static int linearsearch(int[] nums , int target) {
        if (nums.length == 0) {
            return -1;
        }
        for (int index = 0; index < nums.length; index++) {
            int element = nums[index];
            if (element == target)
                return index;
        }
        return -1;

    }
}
