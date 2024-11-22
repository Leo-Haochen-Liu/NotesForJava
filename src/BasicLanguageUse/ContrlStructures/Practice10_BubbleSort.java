package BasicLanguageUse.ContrlStructures;

public class Practice10_BubbleSort {
    /*
    use Bubble Sort to sort the array(from small to big)
     */

    public static double[] BubbleSort(double[] arr) {
        double[] sortedArr = arr;
        for (int i = 0; i < sortedArr.length; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[j] < sortedArr[i]) {
                    double buffer = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] = buffer;
                }
            }
        }
        return sortedArr;
    }

    public static void main(String[] args) {
        double[] arr = {0, -0.1, 3.9, 2.6, -9.9, 8, -10};
        double[] arr1 = BubbleSort(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%.1f ", arr1[i]);
        }
    }
}
