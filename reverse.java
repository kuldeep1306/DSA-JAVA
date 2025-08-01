import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int arr[] = {1, 23, 42, 45, 54};
        reversed(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void reversed(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
        static void swap (int[] arr, int start, int end)
        {
            int temp=arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

    }
