package BasicLanguageUse.ContrlStructures;

public class Practice7_sumAlgorithm2 {

    /*
    * sum: 1 + (1 + 2) + (1 + 2 + 3) + ... + (1 + 2 + ... + 100)
    * */

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += ((1 + i) * i / 2);
        }
        System.out.println(sum);
    }
}
