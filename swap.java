import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1,32,32,44,22,13};
        swapd(arr, 1, 3);
        System.out.print(Arrays.toString(arr));

    }
    static void swapd(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
