public class searchinRange {
    public static void main(String[] args) {
        int[] arr = {21, 23, 3, 4, 3, 42, 3, 1232, 42, 4, 2};
        int target =42;
        System.out.println(searchinrange(arr, target, 1, 3));

    }
    static int searchinrange(int[] arr , int target, int start, int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for(int index= start; index <= end; index++)
        {
            if(target == arr[index])
            {
                return index;
            }
        }
        return -1;
    }
}
