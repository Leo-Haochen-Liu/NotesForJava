package BasicLanguageUse.ContrlStructures;

public class Practice6_sumAlgorithm1 {

    /*
    * sum: 1 - 1/2 + 1/3 - 1/4 ... 1/100
    * */

    public static void main(String[] args) {
        double sum = 0;
        for (double i = 1; i <= 100; i++) {
            sum += Math.pow(-1.0, i + 1) * (1.0 / i);
        }
        System.out.println(sum);
    }
}
