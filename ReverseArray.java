import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayOperations(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void ArrayOperations(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
//Output
//Reversed Array: [5, 4, 3, 2, 1]