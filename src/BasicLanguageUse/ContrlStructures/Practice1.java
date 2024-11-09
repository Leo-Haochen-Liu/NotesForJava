package BasicLanguageUse.ContrlStructures;

public class Practice1 {
    /*
     * 某人有100000元，每经过一次路口都需要交费。交费规则如下：
     * 1）当现金 > 50000时，每次交5%
     * 2）当现金 <= 50000时，每次交1000
     * 计算该人可以经过几次路口，要求：使用 while break 方式完成*/

    public static void main(String[] args) {
//        for loop try out
        double remain = 100000.0;
        int count = 0;
        for (; remain >= 1000; count++) {
            if (remain > 50000) {
                remain *= 0.95;
            } else remain -= 1000;
        }
        System.out.println(count);

//        while-break loop version
        remain = 100000.0;
        count = 0;
        while (true) {
            if (remain > 50000) {
                remain *= 0.95;
                count++;
            } else if (remain >= 1000) { // save <= 5000 && save >= 1000
                remain -= 1000;
                count++;
            } else break;
        }
        System.out.println(count);
    }
}
