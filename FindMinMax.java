public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        int max = findMax(arr);
        int min = findMin(arr);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
}
//output
//Maximum: 8
//Minimum: 1
