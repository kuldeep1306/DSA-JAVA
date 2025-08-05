public class findminnium {
    public static void main(String[] args) {
        int[] arr = {32, 42, 435, 45, 46, 56, 4, 45};
        System.out.println(min(arr));
    }
    static int min(int[] arr)
    {
        int ans=arr[0];
        for(int i=1; i<arr.length;i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
            return ans;

        }

}
