public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 1;
        int ans =(search(arr, target));
        System.out.println(ans);

    }


    static int search(int[] arr, int target)
    {

    int start = 0;
    int end = arr.length - 1;

    while(start<= end)
    {
            int mid = start + (end - start) / 2;


    
        if (target < arr[mid]) {
            end = end - 1;

        }
        else if(target > arr[mid]) {
            start = start + 1;
        } else {
            return mid;
        }
    }
    return-1;
}
}
