public class search2darray {
    public static void main(String[] args) {
        int[][] arr = {
                {32,43,53}, {42,54,63,3},{64,354,4,3534}
        };
                int target = 42;
                int[] result = searcharray(arr,target);
        System.out.println(searcharray(arr,target));


    }
    static int[] searcharray(int[][] arr, int target)
    {
        for(int row=0; row < arr.length; row++)
        {
            for(int column =0;column <arr[row].length ; column++)
            {
                if(arr[row][column] == target)
                {
                    return new int[]{row,column};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
