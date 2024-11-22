package BasicLanguageUse.ContrlStructures;

public class Practice9_sumAndAverage {
    /*
    find the sum and the average number of an array
     */

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int[] arr) {
        double average = (double) sum(arr) / arr.length;
        return average;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr1 = {1, 2};
        System.out.println(average(arr));
        System.out.println(average(arr1));
    }
}
