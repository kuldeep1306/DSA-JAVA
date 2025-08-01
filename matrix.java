class matrix 
{
    public static void main(String args[])
    {
        int[][] arr = {
            {1,2,3},     
            {2,3},
            {5,23,42}
        };

        for (int i=0;i < arr.length;i++)
        {
            for(int j=0; j< arr[i].length ; j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}