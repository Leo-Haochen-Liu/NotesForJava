package BasicLanguageUse.ContrlStructures;

public class Practice8_maxNum {
    /*
     * find out the biggest number's index number in array {4, -1, 9, 10, 23}
     */

    public static int findMax(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, -1, 9, 10, 23};
        System.out.println(findMax(arr));
    }
}
